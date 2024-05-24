public class Plant {
    private String name;
    private String nameLatin;
    private boolean annual;
    private String continent;
    private double height;
    private boolean edible;

    public Plant() {
    }

    public Plant(String name, String nameLatin, boolean annual, String continent, double height, boolean edible) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.annual = annual;
        this.continent = continent;
        this.height = height;
        this.edible = edible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameLatin(String nameLatin) {
        this.nameLatin = nameLatin;
    }

    public void setAnnual(Boolean annual) {
        this.annual = annual;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setEdible(Boolean edible) {
        this.edible = edible;
    }

    public String getName() {
        return this.name;
    }

    public String getNameLatin() {
        return this.nameLatin;
    }

    public Boolean getAnnual() {
        return this.annual;
    }

    public String getContinent() {
        return this.continent;
    }

    public Double getHeight() {
        return this.height;
    }

    public Boolean getEdible() {
        return this.edible;
    }

    @Override
    public String toString() {
        String edibleStatus;
        String growingYear;
        if (edible) {
            edibleStatus = "Yes";
        } else {
            edibleStatus = "No";
        }
        if (annual) {
            growingYear = "annual";
        } else {
            growingYear = "perennial";
        }
        return "Plants:" +
                "Name - " + name + ". " +
                "Name in Latin - " + nameLatin + ". " +
                "Growing year - " + growingYear + ". " +
                "Continent - " + continent + ". " +
                "Height in metters - " + height + ". " +
                "Edible - " + edibleStatus + ". " +
                ".";
    }
}
