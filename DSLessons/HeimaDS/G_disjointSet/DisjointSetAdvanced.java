package G_disjointSet;

public class DisjointSetAdvanced {

    private int[] groups;
    private int count; // count of group

    public DisjointSetAdvanced(int count) {
        this.count = count;
        this.groups = new int[count];
        for (int i = 0; i < count; i++) {
            this.groups[i] = -1;
        }
    }

    public int count() {
        return this.count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (this.groups[p] >= 0) {
            p = this.groups[p];
        }
        return p;
    }

    public void union(int p, int q) {
        int pGroup = find(p);
        int qGroup = find(q);
        if (pGroup != qGroup) {
            if (this.groups[pGroup] > this.groups[qGroup]) {
                this.groups[qGroup] += this.groups[pGroup];
                this.groups[pGroup] = qGroup;
            } else {
                this.groups[pGroup] += this.groups[qGroup];
                this.groups[qGroup] = pGroup;
            }
            this.count--;
        }
    }

}
