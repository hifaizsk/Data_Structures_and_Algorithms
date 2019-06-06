class WeightedQuickUnionPathCompression {

    private int[] size;
    private int[] id;

    private WeightedQuickUnionPathCompression(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);

        if (pid != qid) {
            if (size[pid] >= size[qid]) {
                size[pid] += size[qid];
                id[qid] = pid;
            } else {
                size[qid] += size[pid];
                id[pid] = qid;
            }
        }
    }


    public static void main(String[] args) {

        WeightedQuickUnionPathCompression weightedQuickUnionPathCompression = new WeightedQuickUnionPathCompression(4);
        weightedQuickUnionPathCompression.union(0, 3);
        weightedQuickUnionPathCompression.union(1, 2);
        System.out.println(weightedQuickUnionPathCompression.connected(1, 2));
        System.out.println(weightedQuickUnionPathCompression.connected(1, 3));
        System.out.println(weightedQuickUnionPathCompression.connected(2, 3));
        weightedQuickUnionPathCompression.union(2, 3);
        System.out.println(weightedQuickUnionPathCompression.connected(2, 3));
        System.out.println(weightedQuickUnionPathCompression.connected(0, 3));
        System.out.println(weightedQuickUnionPathCompression.connected(1, 0));
        weightedQuickUnionPathCompression.union(1, 3);
        weightedQuickUnionPathCompression.union(1, 0);
        System.out.println(weightedQuickUnionPathCompression.connected(1, 0));

    }
}