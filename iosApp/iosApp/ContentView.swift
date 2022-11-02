import SwiftUI
import shared

struct ContentView: View {
    
    let repository: ImagesRepository = ImagesRepositoryImpl()
    
    @State var images: [ImageData] = []
    
    @State var showProgressBar = true
        
    @State var gridLayout: [GridItem] = Array(repeating: .init(.flexible()), count: 3)
    
    var body: some View {
                
        NavigationView {
                        
            ZStack {
                if (showProgressBar) {
                    ProgressView()
                        .scaleEffect(
                            2.0,
                            anchor: .center
                        )
                        .progressViewStyle(CircularProgressViewStyle(tint: .blue))
                }
                ScrollView {
                    LazyVGrid(columns: gridLayout, alignment: .center, spacing: 10) {
                        ForEach(images, id: \.id) { item in
                            NavigationLink(
                                destination: ImageDetailsView(
                                    imageData: item,
                                    repository: repository
                                ).id(item.id)
                            ) {
                                Image(item.url)
                                    .renderingMode(.original)
                                    .resizable()
                                    .scaledToFill()
                                    .frame(minWidth: 0, maxWidth: .infinity)
                                    .frame(height: gridLayout.count == 1 ? 200 : 100)
                                    .cornerRadius(10)
                                    .shadow(color: Color.primary.opacity(0.3), radius: 1)
                            }
                        }
                    }.padding(.horizontal)
                        .navigationTitle("Images")
                        .navigationBarTitleDisplayMode(.inline)
                }
            }
        }.task {
            images = repository.getImages()
            showProgressBar = false
        }
    }
    
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
