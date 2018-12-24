package backend.bouquets.phrase;

import backend.bouquets.IBouquets;
import backend.bouquets.phrase.PhraseMaterial;

public class Phrases implements IBouquets {
    private String phrase;
    private PhraseMaterial phraseMaterial;
    private double PhrasePrice;

    public Phrases(String phrase, PhraseMaterial phraseMaterial) {
        this.phrase = phrase;
        this.phraseMaterial = phraseMaterial;
        PhrasePrice = phraseMaterial.getPrice() * phrase.length(); //price depends on the number of letter
    }

    public String getPhrase() {
        return phrase;
    }

    public PhraseMaterial getPhraseMaterial() {
        return phraseMaterial;
    }

    public double getPhrasePrice() {
        return PhrasePrice;
    }
}
