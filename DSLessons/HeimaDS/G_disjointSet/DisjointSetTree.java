package G_disjointSet;

public class DisjointSetTree {

    private int[] groups;
    private int count; // count of group

    public DisjointSetTree(int count) {
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
        while (this.groups[p] != p) {
            p = this.groups[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int pGroup = find(p);
        int qGroup = find(q);
        if (pGroup != qGroup) {
            this.groups[pGroup] = qGroup;
        }
    }

}
