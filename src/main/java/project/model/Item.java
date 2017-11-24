package project.model;

import javax.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private String desc;

    @Column
    private float val;

    protected Item() {
        this.val = -1;
    }

    public Item(String desc, float val, int id) {
        this.desc = desc;
        this.val = val;
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getVal() {
        return val;
    }

    public void setVal(float val) {
        this.val = val;
    }
}
