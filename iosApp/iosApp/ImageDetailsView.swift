import SwiftUI
import shared

struct ImageDetailsView: View {
        
    @State var isLiked: Bool = false
        
    let imageData: ImageData
    let repository: ImagesRepository
    
    var body: some View {
        ScrollView {
            VStack {
                Image(imageData.url)
                    .resizable()
                    .scaledToFill()
                    .frame(height: 200)
                    .clipped()
                HStack {
                    Image(systemName: "location.north.circle")
                    if let location = imageData.location {
                        Text(location)
                    }
                    Spacer()
                }.padding()
                if (imageData.tags.isEmpty == false) {
                    VStack(alignment: .leading) {
                        Text("Tags")
                            .bold()
                            .padding(.horizontal, 20)
                        FlexibleView(
                          data: imageData.tags,
                          spacing: 10,
                          alignment: .leading
                        ) { item in
                          Text(verbatim: item)
                            .padding(8)
                            .background(
                              RoundedRectangle(cornerRadius: 8)
                                .fill(Color.gray.opacity(0.2))
                             )
                        }.padding(.horizontal, 20)
                    }
                }
            }
        }
        .toolbar {
            ToolbarItem(placement: .navigationBarTrailing) {
                Button(
                    action: {
                        isLiked = repository.likeImage(imageId: imageData.id)
                    }
                ) {
                    Image(systemName:  isLiked ? "heart.fill" : "heart")
                        .font(.title)
                        .foregroundColor(.red)
                }
            }
        }
        .onAppear {
            isLiked = imageData.isLiked
        }
    }
}

struct ImageDetailsView_Previews: PreviewProvider {
    static var previews: some View {
        NavigationView {
            ImageDetailsView(
                imageData: ImageData(
                    id:0,
                    location: "Trinity, Ireland",
                    url: "image_25",
                    tags: [
                        "library",
                        "trinity"
                    ],
                    isLiked: false
                ),
                repository: ImagesRepositoryImpl()
            )
        }
    }
}
