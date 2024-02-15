class Auteur{
    private String nom;

  
    private String citaTrag;
    private int qualiTrag;
    
    private String citaCome;
    private int qualiCome;
  
    private String citaDrame;
    private int qualiDrame;
  

    public Auteur(String nomAuteur, int qualiteTrag, String citationTragedie, int qualiteComedie, String citationComedie, int qualiteDrame, String citationDrame){
        this.nom = nomAuteur;
        this.qualiTrag = qualiteTrag;
        this.citaTrag = citationTragedie;
        this.qualiCome = qualiteComedie;
        this.citaCome = citationComedie;
        this.qualiDrame = qualiteDrame;
        this.citaDrame = citationDrame;
    }

    public String getNom(){
        return this.nom;
    }
    public int getQualiteTragedie(){
        return this.qualiTrag;
    }

    public String citaTrag(){
        return this.citaTrag;
    }

    public int getQualiCome(){
        return this.qualiCome;
    }

    public String getCitaCome(){
        return this.citaCome;
    }

    public int getQualiDrame(){
        return this.qualiDrame;
    }
    public String getCitaDrame(){
        return this.citaDrame;
    }

    public String poinFort(){

    }

    public String qualitéStyle(Style s){

    }

    public String citationStyle(Style s){

    }

    @Override
    public String toString(){
        return "L'honorable" + this.nom;
    }

    
}