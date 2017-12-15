package iurii.job.interview.microsoft;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by iurii.dziuban on 15/12/2017.
 */
public class LowestCommonAncestorTest {

    @Test
    public void test() {
        LowestCommonAncestor.Node root =
                new LowestCommonAncestor.Node(
                        new LowestCommonAncestor.Node(
                                new LowestCommonAncestor.Node(null, null, 4),
                                    new LowestCommonAncestor.Node(
                                new LowestCommonAncestor.Node(null, null, 5), null, 6), 3),
                        new LowestCommonAncestor.Node(null, null, 2), 1);

        int lca = new LowestCommonAncestor().lca(root, 5, 4);
        assertThat(lca).isEqualTo(3);
    }
}
