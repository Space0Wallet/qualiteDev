class Auteur{
    private String nom;

  
    private String citaTrag;
    private int qualiTrag;
    
    private String citaCome;
    private int qualiCome;

    private String citaDrame;
    private int qualiDrame;

    Map<String, Integer> perfs;

    public Auteur(){
        this.perfs = new HashMap<>();
        this.perfs.put("DRAME", new Performance("blabla" 100));

        String citationDrame = this.perf.get("DRAME").getCitation();
        Integer dramePerf = this.perfs.get("DRAME").getQualite();

        this.perfs.keySet()[0];
    }

    public getQualitéTragédie(){

    }
}