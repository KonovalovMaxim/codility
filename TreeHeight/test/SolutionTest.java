import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @org.junit.Test
    public void solution() throws Exception {
        Tree tree = new Tree();
        tree.l = new Tree();
        tree.r = new Tree();
        tree.r.r = new Tree();
        tree.r.r.r = new Tree();
        tree.l.l = new Tree();
        tree.l.l.l = new Tree();
        tree.l.l.l.l = new Tree();
        assertEquals(4, new Solution().solution(tree));
    }
}