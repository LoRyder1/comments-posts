package groovypublish

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    // void testTitleIsRequired() {
    //   Post post = new Post(teaser: 'foo', content: 'bar', published:false)
    //   assertNull(post.save())

    //   post.title = 'my title'
    //   assertNotNull(post.save())
    // }
}
