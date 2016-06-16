import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void solution() throws Exception {
        assertEquals(3, new Solution().solution("racecar"));
    }

    @Test
    public void solution2() throws Exception {
        assertEquals(1, new Solution().solution("aba"));
    }

    @Test
    public void solution3() throws Exception {
        assertEquals(-1, new Solution().solution("abb"));
    }
}