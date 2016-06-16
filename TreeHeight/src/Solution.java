class Solution {
    public int solution(Tree T) {
        return getTreeHeight(T, -1);
    }

    private int getTreeHeight(Tree tree, int current) {
        if (tree == null) {
            return current;
        }
        current++;
        return Math.max(getTreeHeight(tree.l, current), getTreeHeight(tree.r, current));
    }
}

class Tree {
    public int x;
    public Tree l;
    public Tree r;
}