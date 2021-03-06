import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() throws Exception {
        assertEquals(0, new Solution().solution(new int[]{1, 5, 2, 2}));
    }

    @Test
    public void test2() {
        assertEquals(0, new Solution().solution(new int[]{3, 3, 3, 4, 5}));
    }

    @Test
    public void test3() {
        assertEquals(0, new Solution().solution(new int[]{0}));
    }

    @Test
    public void test4() {
        assertEquals(0, new Solution().solution(new int[]{0, 0, 0, 0, 0, 0, 0, 0}));
    }

    @Test
    public void test5() {
        assertEquals(5, new Solution().solution(new int[]{14, 19}));
    }

    @Test
    public void test6() {
        assertEquals(4, new Solution().solution(new int[]{4, 4, 4, 4, 4}));
    }

    @Test
    public void test7() {
        assertEquals(1, new Solution().solution(new int[]{5, 5, 1, 1, 3}));
    }

    @Test
    public void test8() {
        assertEquals(1, new Solution().solution(new int[]{4, 6, 8, 9}));
    }
}