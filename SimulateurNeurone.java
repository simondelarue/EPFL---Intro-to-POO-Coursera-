package Java_exercises;

import java.util.ArrayList;

class Position{
    private double x;
    private double y;

    public Position(double unX, double unY){
        x = unX;
        y = unY;
    }
    public Position(){
        x = 0.0;
        y = 0.0;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public String toString(){
        return ("(" + getX() + ", " + getY() + ")");
    }
}
class Neurone{
    private Position position;
    private double signalInterne;
    private double facteurAttenuation;
    private ArrayList<Neurone> connexions;

    public Neurone(Position unePos, double unFacteur){
        position = unePos;
        signalInterne = 0;
        facteurAttenuation = unFacteur;
        connexions = new ArrayList<Neurone>();
    }

    public Position getPosition(){
        return position;
    }
    public int getNbConnexions(){
        return connexions.size();
    }
    public Neurone getConnexion(int index){
        return connexions.get(index);
    }
    public double getAttenuation(){
        return facteurAttenuation;
    }
    public double getSignal(){
        return signalInterne;
    }

    public void connexion(Neurone n){
        connexions.add(n);
    }
    public void recoitStimulus(double stimulus){
        this.signalInterne = stimulus * this.facteurAttenuation;
        for (Neurone n : connexions){
            n.recoitStimulus(this.signalInterne);
        }
    }
    public String toString(){
        String res="";
        res += "Le neurone en position " + this.getPosition();
        res += " avec attenuation " + getAttenuation();
        if (this.getNbConnexions()>0){
            res += " en connexion avec\n";
            for (Neurone n : connexions){
                res += ("  - un neurone en position " + n.getPosition() + "\n");
            }
        } else {
            res += " sans connexion\n";
        }
        return res;
    }
}
class NeuroneCumulatif extends Neurone{

    public NeuroneCumulatif(Position unePos, double unFacteur){
        super(unePos, unFacteur);
    }

    public void recoitStimulus(double stimulus){
        super.recoitStimulus(getSignal()/getAttenuation() + stimulus);
    }
}
class Cerveau{
    private ArrayList<Neurone> neurones;

    public Cerveau(){
        neurones = new ArrayList<Neurone>();
    }

    public int getNbNeurones(){
        return neurones.size();
    }
    public Neurone getNeurone(int index){
        return neurones.get(index);
    }

    public void ajouterNeurone(Position pos, double attenuation){
        Neurone n = new Neurone(pos, attenuation);
        neurones.add(n);
    }
    public void ajouterNeuroneCumulatif(Position pos, double attenuation){
        NeuroneCumulatif nCum = new NeuroneCumulatif(pos, attenuation);
        neurones.add(nCum);
    }
    public void stimuler(int index, double stimulus){
        neurones.get(index).recoitStimulus(stimulus);
    }
    public double sonder(int index){
        return neurones.get(index).getSignal();
    }
    public void creerConnexions(){
        if (neurones.size()>1){
            neurones.get(0).connexion(neurones.get(1));
        }
        if (neurones.size()>2){
            neurones.get(0).connexion(neurones.get(2));
        }
        if (neurones.size()>3){
            for (int i=1; i<neurones.size()-2; i+=2){
                neurones.get(i).connexion(neurones.get(i+1));
                neurones.get(i+1).connexion(neurones.get(i+2));
            }
        }
    }
    public String toString(){
        String res="Le cerveau contient " + getNbNeurones() + " neurone(s)\n";
        for (Neurone n : neurones){
            res += n + "\n";
        }
        System.out.println();
        System.out.println("*----------*\n");
        return res;
    }

}

/*******************************************
 * Ne pas modifier apres cette ligne
 * pour pr'eserver les fonctionnalit'es et
 * le jeu de test fourni.
 * Votre programme sera test'e avec d'autres
 * donn'ees.
 *******************************************/
public class SimulateurNeurone {

    public static void main(String[] args) {
        // TEST DE LA PARTIE 1
        System.out.println("Test de la partie 1:");
        System.out.println("--------------------");

        Position position1 = new Position(0, 1);
        Position position2 = new Position(1, 0);
        Position position3 = new Position(1, 1);

        Neurone neuron1 = new Neurone(position1, 0.5);
        Neurone neuron2 = new Neurone(position2, 1.0);
        Neurone neuron3 = new Neurone(position3, 2.0);

        neuron1.connexion(neuron2);
        neuron2.connexion(neuron3);
        neuron1.recoitStimulus(10);

        System.out.println("Signaux : ");
        System.out.println(neuron1.getSignal());
        System.out.println(neuron2.getSignal());
        System.out.println(neuron3.getSignal());

        System.out.println();
        System.out.println("Premiere connexion du neurone 1");
        System.out.println(neuron1.getConnexion(0));


        // FIN TEST DE LA PARTIE 1

        // TEST DE LA PARTIE 2
        System.out.println("Test de la partie 2:");
        System.out.println("--------------------");

        Position position5 = new Position(0, 0);
        NeuroneCumulatif neuron5 = new NeuroneCumulatif(position5, 0.5);
        neuron5.recoitStimulus(10);
        neuron5.recoitStimulus(10);
        System.out.println("Signal du neurone cumulatif  -> " + neuron5.getSignal());
        // FIN TEST DE LA PARTIE 2

        // TEST DE LA PARTIE 3
        System.out.println();
        System.out.println("Test de la partie 3:");
        System.out.println("--------------------");
        Cerveau cerveau = new Cerveau();

        // parametres de construction du neurone:
        // la  position et le facteur d'attenuation
        cerveau.ajouterNeurone(new Position(0,0), 0.5);
        cerveau.ajouterNeurone(new Position(0,1), 0.2);
        cerveau.ajouterNeurone(new Position(1,0), 1.0);

        // parametres de construction du neurone cumulatif:
        // la  position et le facteur d'attenuation
        cerveau.ajouterNeuroneCumulatif(new Position(1,1), 0.8);
        cerveau.creerConnexions();
        cerveau.stimuler(0, 10);

        System.out.println("Signal du 3eme neurone -> " + cerveau.sonder(3));
        System.out.println(cerveau);
        // FIN TEST DE LA PARTIE 3
    }
}
