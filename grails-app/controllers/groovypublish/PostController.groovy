package groovypublish

class PostController {

  def defaultAction = 'list'

  def edit = {
    def post = Post.get(params.id)
    if(!post) {
      post = new Post()
    }
    render(view: 'edit', model:[post:post])
  }

  def list = {
    render( view: 'list',
            model:[posts:Post.list(
                    sort: 'lastUpdated',
                    order: 'desc')])
  }

    def index() { 
      render("Hello world")
    }

    def goodbye() {
      render("Goodbye world")
    }
}
