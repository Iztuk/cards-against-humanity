import java.util.Arrays;
public class CardGenerator {
    public String GetWhiteCard(int x){
        String[] whiteCard =
                {
                        "Being on fire", "Racism", "Old-people smell", "A micropenis",
                        "Women in yogurt commercials", "Classist undertones", "Not giving a shit about the Third World", "Inserting a mason jar into my anus",
                        "Court-ordered rehab", "A windmill full of corpses", "The gays", "An oversized lollipop",
                        "African children", "An asymmetric boob job", "Bingeing and purging", "The hardworking mexican",
                        "An Oedipus complex", "A tiny horse", "Boogers", "Penis envy",
                        "Barack Obama", "My humps", "The Tempurpedic Swedish Sleep System", "Scientology",
                        "Dry heaving", "Skeletor", "Darth Vader", "Figgy pudding",
                        "Advice from a wise, old black man", "Five-Dollar Footlongs", "Elderly Japanese men", "Free samples",
                        "Estrogen", "Sexual tension", "Famine", "A stray pube",
                        "Men", "Heartwarming orphans", "Chunks of dead hitchiker", "A bag of magic beans",
                        "Repression", "Prancing", "My relationship status", "Overcompensation",
                        "Peeing a little bit", "Pooping back and forth. Forever", "A ball of earwax, semen, and toenail clippins", "Testicular torsion",
                        "The Devil himself", "The World of Warcraft", "Dick Cheney", "MechaHitler",
                        "Being fabulous", "Pictures of boobs", "A gentle caress of the inner thigh", "The Amish",
                        "The rhythms of Africa", "Lance Armstrong's missing testicle", "Pedophiles", "The Pope",
                        "Flying sex snakes", "Sarah Palin", "Feeding Rosie O'Donnell", "Sexy pillow fights",
                        "Invading Polans", "Cybernetic enhancements", "Civilian casualties", "Jobs",
                        "The female orgasm", "Bitches", "The Boy Scouts of America", "Auschwitz",
                        "Finger painting", "The Care Bear Stare", "The Jews", "Being Marginalized",
                        "The Blood of Christ", "Dead parents", "The art of seduction", "Dying of dysentery",
                        "Mr. Clean, right begind you", "Magnets", "Jewish fraternities", "Hot Pockets",
                        "Natalie Portman", "Agriculture", "Judge Judy", "Surprise sex",
                        "The homosexual agenda", "Robert Downey Jr.", "The Trail of Tears", "An M. Nigth Shyamalan plot twist",
                        "Funky fresh rhymes", "The light of a billion suns", "Amputees", "Throwing a virgin into a volcano",
                        "Italians", "Explosions", "A good sniff", "Destroying the evidence"
                };
        return whiteCard[x];
    }

    public String getBlackCard(int x){
        String[] blackCard = {
                "How did I lose my virginity?", "Why can't I sleep at night?", "What's that smell?", "I got 99 problems but _____ ain't one.",
                "Maybe she's born with it. Maybe it's _____.", "What's the next Happy Meal toy?", "Here is the church Here is the steeple Open the doors And there is _____", "It's a pity that kids these days are all getting involved with _____",
                "Today on Maury: Help! My son is _____.", "Alternative medicine is not embracing the curative powers of _____", "What's that sound?", "What ended my last relationship",
                "MTV's new reality show features eight washed-up celebrities living with _____.", "I drink to forget _____", "I'm sorry Professor, but I couldn't complete my homework because of _____.", "What is Batman's guilty pleasure?",
                "This is the way the world ends, not with a bang but with _____.", "What's a girl's best friend?", "TSA guidelines now prohibit _____ on airplanes.", "_____. That's how I want to die."
        };
        return blackCard[x];
    }
}
