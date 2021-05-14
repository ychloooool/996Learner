package G_disjointSet;

public class DisjointSet {

    private int[] groups;
    private int count; // count of group

    public DisjointSet(int count) {
        this.count = count;
        this.groups = new int[this.count];
        for (int i = 0; i < this.count; i++) {
            this.groups[i] = i;
        }
    }

    public int count() {
        return this.count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        return this.groups[p];
    }

    public void union(int p, int q) {
        if (!connected(p, q)) {
            for (int i = 0; i < this.count; i++) {
                if (groups[i] == groups[p]) {
                    groups[i] = groups[q];
                }
            }
        }
    }

}
