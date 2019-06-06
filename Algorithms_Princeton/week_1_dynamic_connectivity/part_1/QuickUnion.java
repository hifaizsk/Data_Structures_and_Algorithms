class QuickUnion {

    private int[] id;

    private QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private void union(int p, int q) {
        int proot = root(id[p]);
        int qroot = root(id[q]);
        id[proot] = qroot;
    }

    public static void main(String[] args) {

        QuickUnion qu = new QuickUnion(4);
        qu.union(0, 3);
        qu.union(1, 2);
        System.out.println(qu.connected(1, 2));
        System.out.println(qu.connected(1, 3));
        System.out.println(qu.connected(2, 3));
        qu.union(2, 3);
        System.out.println(qu.connected(2, 3));
        System.out.println(qu.connected(0, 3));
        System.out.println(qu.connected(1, 0));
        qu.union(1, 3);
        qu.union(1, 0);
        System.out.println(qu.connected(1, 0));

    }

}