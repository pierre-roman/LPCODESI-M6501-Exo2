public class CarteDebit extends CartePaiement{
    protected Compte compteAssocie;
    @Override
    public boolean autorisePaiement(int montant) {
        return (compteAssocie.solde >= montant);
    }
}
