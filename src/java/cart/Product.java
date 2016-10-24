
package cart;

import java.io.Serializable;

public class Product implements Serializable{
    
    private static final long serialVersionUID = 1L;
    int id;
    int cat_id;
    String pname;
    String description;
    
    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int cat_id,int id, String pname,String description) {
        this.cat_id=cat_id;
        this.id = id;
        this.pname =pname;
        this.description=description;
    }
    
    public int getCatId() {
        return cat_id;
    }

    public void setCatId(int cat_id) {
        this.cat_id = cat_id;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return pname;
    }

    public void setName(String pname) {
        this.pname = pname;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description =description;
    }
       
    
}
