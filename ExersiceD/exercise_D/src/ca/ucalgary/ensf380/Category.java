package ca.ucalgary.ensf380;

public class Category {
    private String subCategory;
    private Category superCategory;

    public Category(String subCategory, Category superCategory) {
        this.subCategory = subCategory;
        this.superCategory = superCategory;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Category getSuperCategory() {
        return superCategory;
    }

    public void setSuperCategory(Category superCategory) {
        this.superCategory = superCategory;
    }
}
