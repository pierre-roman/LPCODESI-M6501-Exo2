public abstract class CartePaiement {
    public void payeAchat(int montant){
        System.out.println("un achat de " + montant + " euros a été effectué");
    }

    public abstract void autorisePaiement(int montant);
}
