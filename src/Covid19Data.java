    public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int confirmed;
    private int death;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;
    public Covid19Data(String region,String aldersgruppe,int confirmed,int death,int indlagteIntensiv ,int indlagte, String dato){
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.confirmed = confirmed;
        this.death = death;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;

    }
    @Override
        public String toString(){
return "Region=" + region +
        "; aldersgruppe=" + aldersgruppe +
        "; bekræftede=" + confirmed +
        "; døde=" + death +
        "; indlagte på intensiv afdeling=" + indlagteIntensiv +
        "; indlagte=" + indlagte +
        "; dato=" + dato +
        "";
    }
}
