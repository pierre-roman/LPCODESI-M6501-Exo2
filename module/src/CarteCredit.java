public class CarteCredit extends CartePaiement{
    protected int plafond;
    protected int encours;

    public boolean autorisePaiement(int montant){
        return (encours+montant<=plafond);
    }

}
