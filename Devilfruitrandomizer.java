package devilfruitrandomizer;
import java.util.Scanner;
import java.util.Random;
public class Devilfruitrandomizer {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String answer;
        
        System.out.println("Hello! Welcome to the Devil Fruit randomizer!");
        System.out.println("Here, you will be able to gamble on what One Piece Devil Fruit you would get if you so choose!");
        System.out.println("");
        System.out.println("! ! ! IMPORTANT ! ! !");
        System.out.println("The Devil Fruits included here are up to date with the manga (Chapter 1124 as of 9/3/2024).");
        System.out.println("Although important and spoiler-y Devil Fruits are excluded, side and support characters' fruits are included.");
        System.out.println("");
        System.out.println("     Y O U   H A V E   B E E N   W A R N E D");
        System.out.println("");
        
        System.out.println("When you are ready, please enter 'P' to get a "
                + "random Paramecia type, 'L' to get a random Logia type,");
        System.out.println("'Z' to get a random Zoan type, or 'A' to get any random Devil Fruit!");
        System.out.println("If you don't want to gamble, type 'Exit'.");
        
        
        String [] anyFruitJapanese = {"Gomu Gomu no Mi", "Bara Bara no Mi", "Sube Sube no Mi", "Bomu Bomu no Mi", "Kiro Kiro no Mi", "Hana Hana no Mi", "Doru Doru no Mi", "Baku Baku no Mi", "Mane Mane no Mi", "Supa Supa no Mi","Toge Toge no Mi", "Ori Ori no Mi", "Bane Bane no Mi", "Ito Ito no Mi", "Noro Noro no Mi", "Doa Doa no Mi", "Awa Awa no Mi", "Beri Beri no Mi", "Sabi Sabi no Mi", "Shari Shari no Mi", "Horo Horo no Mi", "Yomi Yomi no Mi", "Kage Kage no Mi", "Suke Suke no Mi", "Nikyu Nikyu no Mi", "Toshi Toshi no Mi", "Jiki Jiki no Mi", "Ope Ope no Mi", "Shiro Shiro no Mi", "Wara Wara no Mi", "Oto Oto no Mi", "Mero Mero no Mi", "Doku Doku no Mi", "Horu Horu no Mi", "Choki Choki no Mi", "Gura Gura no Mi", "Kira Kira no Mi", "Poke Poke no Mi", "Woshu Woshu no Mi", "Deka Deka no Mi", "Mato Mato no Mi", "Fuku Fuku no Mi", "Hobi Hobi no Mi", "Buki Buki no Mi", "Guru Guru no Mi", "Beta Beta no Mi", "Zushi Zushi no Mi", "Bari Bari no Mi", "Nui Nui no Mi", "Giro Giro no Mi", "Ato Ato no Mi", "Jake Jake no Mi", "Pamu Pamu no Mi", "Sui Sui no Mi", "Ton Ton no Mi", "Hira Hira no Mi", "Ishi Ishi no Mi", "Fude Fude no Mi", "Nagi Nagi no Mi", "Chiyu Chiyu no Mi", "Maki Maki no Mi", "Soru Soru no Mi", "Mira Mira no Mi", "Pero Pero no Mi", "Bisu Bisu no Mi", "Bata Bata no Mi", "Buku Buku no Mi", "Kuri Kuri no Mi", "Shibo Shibo no Mi", "Memo Memo no Mi", "Mochi Mochi no Mi", "Hoya Hoya no Mi", "Netsu Netsu no Mi", "Kuku Kuku no Mi", "Gocha Gocha no Mi", "Oshi Oshi no Mi", "Kobu Kobu no Mi", "Kibi Kibi no Mi", "Toki Toki no Mi", "Juku Juku no Mi", "Shiku Shiku no Mi", "Wapu Wapu no Mi", "Riki Riki no Mi", "Nomi Nomi no Mi", "Shima Shima no Mi", "Gabu Gabu no Mi", "Muchi Muchi no Mi", "Nori Nori no Mi", "Moku Moku no Mi", "Suna Suna no Mi", "Mera Mera no Mi", "Goro Goro no Mi", "Hie Hie no Mi", "Yami Yami no Mi", "Pika Pika no Mi", "Magu Magu no Mi", "Susu Susu no Mi", "Numa Numa no Mi", "Gasu Gasu no Mi", "Yuki Yuki no Mi", "Mori Mori no Mi", "Ushi Ushi no Mi, Model: Bison", "Ushi Ushi no Mi, Model: Giraffe", "Hito Hito no Mi", "Hito Hito no Mi, Model: Daibutsu", "Hito Hito no Mi, Model: Onyudo", "Tori Tori no Mi, Model: Falcon", "Tori Tori no Mi, Model: Phoenix", "Tori Tori no Mi, Model: Albatross", "Inu Inu no Mi, Model: Dachshund", "Inu Inu no Mi, Model: Jackal", "Inu Inu no Mi, Model: Wolf", "Inu Inu no Mi, Model: Tanuki", "Inu Inu no Mi, Model: Kyubi no Kitsune", "Inu Inu no Mi, Model: Okuchi no Makami", "Uma Uma no Mi", "Uma Uma no Mi, Model: Pegasus", "Neko Neko no Mi, Model: Leopard", "Neko Neko no Mi, Model: Saber Tiger", "Zou Zou no Mi", "Zou Zou no Mi, Model: Mammoth", "Ryu Ryu no Mi, Model: Allosaurus", "Ryu Ryu no Mi, Model: Spinosaurus", "Ryu Ryu no Mi, Model: Pteranodon", "Ryu Ryu no Mi, Model: Brachiosaurus", "Ryu Ryu no Mi, Model: Pachycephalosaurus", "Ryu Ryu no Mi, Model: Triceratops", "Hebi Hebi no Mi, Model: King Cobra", "Hebi Hebi no Mi, Model: Anaconda", "Hebi Hebi no Mi, Model: Yamato no Orochi", "Sara Sara no Mi, Model: Axolotl", "Mushi Mushi no Mi, Model: Kabutomushi", "Mushi Mushi no Mi, Model: Suzumebachi", "Uo Uo no Mi, Model: Seiryu", "Kumo Kumo no Mi, Model: Rosamygale Grauvogeli", "Mogu Mogu no Mi", "Kame Kame no Mi", "Tama Tama no Mi"};
        String [] anyFruitEnglish = {"Gum Gum Fruit", "Chop Chop Fruit", "Smooth Smooth Fruit", "Bomb Bomb Fruit", "Kilo Kilo Fruit", "Flower Flower Fruit", "Wax Wax Fruit", "Munch Munch Fruit", "Clone Clone Fruit", "Dice Dice Fruit","Spike Spike Fruit", "Cage Cage Fruit", "Spring Spring Fruit", "String String Fruit", "Slow Slow Fruit", "Door Door Fruit", "Bubble Bubble Fruit", "Berry Berry Fruit", "Rust Rust Fruit", "Wheel Wheel Fruit", "Hollow Hollow Fruit", "Revive Revive Fruit", "Shadow Shadow Fruit", "Clear Clear Fruit", "Paw Paw Fruit", "Age Age Fruit", "Magnet Magnet Fruit", "Op Op Fruit", "Castle Castle Fruit", "Straw Straw Fruit", "Tone Tone Fruit", "Love Love Fruit", "Poison Poison Fruit", "Horm Horm Fruit", "Snip Snip Fruit", "Tremor Tremor Fruit", "Twinkle Twinkle Fruit",  "Pocket Pocket Fruit", "Wash Wash Fruit", "Huge Huge Fruit", "Mark Mark Fruit", "Garb Garb Fruit", "Hobby Hobby Fruit", "Arms Arms Fruit", "Spin Spin Fruit", "Sticky Sticky Fruit", "Press Press Fruit", "Barrier Barrier Fruit", "Stitch Stitch Power", "Glare Glare Fruit", "Art Art Fruit", "Jacket Jacket Fruit", "Pop Pop Fruit", "Swim Swim Fruit", "Ton Ton Fruit", "Ripple Ripple Fruit", "Stone Stone Fruit", "Brush Brush Fruit", "Calm Calm Fruit", "Heal Heal Fruit", "Scroll Scroll Fruit", "Soul Soul Fruit", "Mirror Mirror Fruit", "Lick Lick Fruit", "Bis Bis Fruit", "Butter Butter Fruit", "Book Book Fruit", "Cream Cream Fruit", "Wring Wring Fruit", "Memo Memo Fruit", "Mochi Mochi Fruit", "Puff Puff Fruit", "Heat Heat Fruit", "Cook Cook Fruit", "Pile Pile Fruit", "Push Push Fruit", "Pump Pump Fruit", "Millet Millet Fruit", "Time Time Fruit", "Ripe Ripe Fruit", "Sick Sick Fruit", "Warp Warp Fruit", "Strong Strong Fruit", "Brain Brain Fruit", "Isle Isle Fruit", "Glug Glug Fruit", "Whip Whip Fruit", "Ride Ride Fruit", "Smoke Smoke Fruit", "Sand Sand Fruit", "Flame Flame Fruit", "Rumble Rumble Fruit", "Ice Ice Fruit", "Dark Dark Fruit", "Glint Glint Fruit", "Mag Mag Fruit", "Soot Soot Fruit", "Swamp Swamp Fruit", "Gas Gas Fruit", "Snow Snow Fruit", "Woods Woods Fruit", "Ox Ox Fruit, Model: Bison", "Ox Ox Fruit, Model: Giraffe", "Human Human Fruit", "Human Human Fruit, Model: Buddha", "Human Human Fruit, Model: Onyudo", "Bird Bird Fruit, Model: Falcon", "Bird Bird Fruit, Model: Phoenix", "Bird Bird Fruit, Model: Albatross", "Dog Dog Fruit, Model: Dachshund", "Dog Dog Fruit, Model: Jackal", "Dog Dog Fruit, Model: Wolf", "Dog Dog Fruit, Model: Tanuki", "Dog Dog Fruit, Model: Nine-Tailed Fox", "Dog Dog Fruit, Model: Okuchi no Makami", "Horse Horse Fruit", "Horse Horse Fruit, Model: Pegasus", "Cat Cat Fruit, Model: Leopard", "Cat Cat Fruit, Model: Saber-Toothed Tiger", "Elephant Elephant Fruit", "Elephant Elephant Fruit, Model: Mammoth", "Dragon Dragon Fruit, Model: Allosaurus", "Dragon Dragon Fruit, Model: Spinosaurus", "Dragon Dragon Fruit, Model: Pteranodon", "Dragon Dragon Fruit, Model: Brachiosaurus", "Dragon Dragon Fruit, Model: Pachycephalosaurus", "Dragon Dragon Fruit, Model: Triceratops", "Snake Snake Fruit, Model: King Cobra", "Snake Snake Fruit, Model: Anaconda", "Snake Snake Fruit, Model: Yamato no Orochi", "Sala Sala Fruit, Model: Axolotl", "Bug Bug Fruit, Model: Rhinoceros Beetle", "Bug Bug Fruit, Model: Hornet", "Fish Fish Fruit, Model: Azure Dragon", "Spider Spider Fruit, Model: Rosamygale Grauvogeli", "Mole Mole Fruit", "Turtle Turtle Fruit", "Egg Egg Fruit"};
        String [] anyFruitDescription = {"Turns the user's body into rubber, giving them the power to stretch, as well as making them immune to electricity and near impervious to blunt-force attacks and bullets.", 
        "Allows the user to split their body into separate pieces, which they can manipulate and levitate through the air. It also makes them immune to slashing attacks.", 
        "Makes the user's skin extremely smooth and slippery, causing attacks, objects, and even excess body fat to harmlessly slide off them.", 
        "Allows the user to create explosions from their body, as well as give explosive properties to their bodily secretions. Also makes the user immune to explosions.",
        "Allows the user to increase or decrease their body weight at will, anywhere between 1 and 10,000 kilograms.",
        "Allows the user to sprout duplicates of their body parts from any nearby surface. The user maintains full control of duplicated limbs and can perceive sights and sounds remotely through duplicate eyes and ears.",
        "Allows the user to create and control candle wax.",
        "Allows the user to expand their mouth and eat anything, as well as allowing them to transform their body to replicate the characteristics and function of anything they've eaten in the past 24 hours.",
        "Allows the user to transform into a physical lookalike of any person whose face they have touched.",
        "Allows the user to transform any part of their body into a blade, thus gaining slashing abilities and making their skin as hard as steel.",
        "Allows the user to grow long, pointy spikes from their body that are strong enough to pierce through solid stone.",
        "Allows the user to create iron bars from their body and create iron bindings on their opponents.",
        "Allows the user to turn their body and limbs into springs.",
        "Allows the user to create and control strings.",
        "Allows the user to emit special unique photons. Anything hit by these photons will be trapped in a state of slow motion for 30 seconds.",
        "Allows the user to create and open doors on anything, including walls, living beings, and even the air itself.",
        "Allows the user to create and control soap bubbles that can clean anything, including cleaning the strength off an opponent.",
        "Allows the user to split their body into many spheres.",
        "Allows the user to rapidly rust anything they touch, including organic material.",
        "Allows the user to turn their limbs into wheels.",
        "Allows the user to create and control ghosts with different abilities, such as inflicting feelings of despair on people whom they pass through, or exploding with great force. The user can also make their own ghost leave their body as a form of astral projection.",
        "Allows the user's soul to return to the living world after dying, bringing the user back to life.",
        "Allows the user to manifest and control shadows. They can animate and freely manipulate their own shadow, as well as steal and absorb other people's shadows, making the user bigger and stronger. Stolen shadows can also be implanted into corpses, reanimating them.",
        "Allows the user to become invisible, as well as make anything they touch invisible.",
        "Gives the user paw pads on their hands that can repel anything they touch. They can even repel intangible things like pain out of a target's body and manifest it as a tangible paw-shaped bubble.",
        "Allows the user to manipulate the aging process of any person or object.",
        "Allows the user to manipulate magnetic forces.",
        "Allows the user to manifest a large sphere of aura, inside which they can manipulate the fabric of space, allowing the user to teleport, telekinetically move things, cleave things without actually damaging them, reassemble things into various combinations, and generate high voltage energy.",
        "Allows the user to become a literal miniature living fortress equipped with cannons, as well as letting them shrink people and objects who enter their body and house them inside.",
        "Allows the user to create and control straw. They can also create straw voodoo dolls, allowing the user to transfer the damage they take to the dolls and, by extension, the people connected to them.",
        "Allows the user to morph their body parts into musical instruments and weaponize the sound waves they create.",
        "Allows the user to turn people that feel attraction to them into stone statues.",
        "Allows the user to create and control poison.",
        "Allows the user to create various special hormones that can alter a person's body in various ways. The user can also turn their fingers into syringes that they can use to inject the hormones into a person's body.",
        "Allows the user to transform parts of their body into scissors. Anything cut by these scissors briefly gains the properties of paper.",
        "Allows the user to create quakes and shockwaves. Considered to be the most powerful Paramecia.",
        "Allows the user to transform their body into diamond.",
        "Gives the user a pocket on their body where they can store objects, including very large objects that are bigger than the pocket holes themselves. The user can pull these stored objects back out at will.",
        "Allows the user to literally wash and fold a person as if they were laundry. It also makes the victim's heart cleaner.",
        "Allows the user to greatly increase the size of their body.",
        "Allows the user to mark a person as their target by touching them so that any weapon thrown with that same hand will chase after the marked target.",
        "Allows the user to create clothing.",
        "Allows the user to turn people into subservient living toys, simultaneously erasing any memory of the victim from the minds of others. It also halts the user's aging.",
        "Allows the user to transform their body into any kind of weapon.",
        "Allows the user to make any part of their body spin like a propeller",
        "Allows the user to create and control mucus.",
        "Allows the user to manipulate gravity.",
        "Allows the user to create barriers by crossing their fingers. The barriers can also be shaped into constructs. However, the user is limited to only one barrier at a time.",
        "Allows the user to stitch things together. It works on both objects and living things.",
        "Allows the user to see through solid objects and over vast distances, as well as see into people's minds and memories. The user achieves this by forming a circle with their index finger and thumb and looking through it.",
        "Allows the user to transform people and objects into abstract art, rendering them unable to function.",
        "Allows the user to transform into a whole-body jacket and control the body of the person wearing them. While being worn, the user can take advantage of both their own physical abilities and those of the person wearing them.",
        "Allows the user to expand and rupture their body, as well as expand and rupture any inorganic object they touch.",
        "Allows the user to swim freely through solid ground and walls.",
        "Allows the user to drastically increase their body weight, by as much as thousands of metric tons.",
        "Allows the user to give anything they touch the properties of fabric, making it thin, flexible, and fluttering. They can also bestow the properties of fabric onto their own body.",
        "Allows the user to assimilate into and control stone.",
        "Allows the user to create and control ink, as well as manifest and manipulate anything they draw using a brush.",
        "Allows the user to nullify sounds.",
        "Allows the user to heal people's wounds.",
        "Allows the user to create and control scrolls. These scrolls have special properties, including the ability to store objects inside them.",
        "Allows the user to extract souls/lifespan from people who fear them and use those souls to bring objects to life. These objects are subservient to the user. Objects brought to life with a fragment of the user's own soul are stronger than others.",
        "Allows the user to create mirrors that can reflect attacks, as well as transform living things, including themselves, into a reflection of their chosen target. The user can also turn any mirror into an entrance to the Mirro-World.",
        "Allows the user to create and control candy.",
        "Allows the user to create and control biscuits.",
        "Allows the user to create and control butter.",
        "Allows the user to manipulate books, as well as trap people inside them.",
        "Allows the user to create and control cream.",
        "Allows the user to drain liquid from people and objects, as well as transfer that liquid into their own body, making them bigger and stronger.",
        "Allows the user to manipulate people's memories.",
        "Allows the user to create, control, and even transform their body into mochi.",
        "Allows the user to summon a powerful warrior genie from their body by rubbing their belly.",
        "Allows the user to emit high heat from their body.",
        "Allows the user to transform objects into bad tasting, but nutritious food.",
        "Allows the user to fuse themselves with other people.",
        "Allows the user to manipulate the ground as if it were made of clay.",
        "Allows the user to rally people into fighting and awaken their latent potential.",
        "Allows the user to create delicious, but non-nourishing 'dango' from their cheek by pinching it. Any animal that eats one of these dango is tamed and becomes subservient to the user for a month.",
        "Allows the user to send themselves and others forward in time.",
        "Allows the user to rapidly mature and decay any person or object they touch.",
        "Allows the user to afflict others with diseases.",
        "Allows the user to teleport themselves and others from place to place.",
        "Gives the user superhuman strength.",
        "Allows the user's brain to store an indefinite amount of information and recall everything they ever learn. It also causes their brain to expand continuously as a result.",
        "Allows the user to merge themself with an island itself and control its environment.",
        "Currently unknown alcohol-based powers.",
        "Allows the user to force anything they whip to obey their orders.",
        "Allows the user to control anything they ride.",
        "Allows the user to create, control, and transform into smoke.",
        "Allows the user to create, control, and transform into sand. The sand can dehydrate any non-metallic substance it touches.",
        "Allows the user to create, control, and transform into fire.",
        "Allows the user to create, control, and transform into lightning.",
        "Allows the user to create, control, and transform into ice.",
        "Allows the user to create, control, and transform into darkness. The darkness has strong gravitational properties, and the user has an infinite amount of space inside of their elemental body.",
        "Allows the user to create, control, and transform into light.",
        "Allows the user to create, control, and transform into magma. It ranks amongst the greatest attack power out of all the Devil Fruits.",
        "Allows the user to create, control, and transform into soot.",
        "Allows the user to create, control, and transform into mud. The user is a 'bottomless swamp', granting them an infinite amount of space inside their elemental body. The mud can also take on the properties of quicksand.",
        "Allows the user to create, control, and transform into gas.",
        "Allows the user to create, control, and transform into snow.",
        "Allows the user to create, control, and transform into flora. The user can become what is described to be a living forest.",
        "Allows the user to become a full bison or a half-bison hybrid.",
        "Allows the user to become a full giraffe or a half-giraffe hybrid.",
        "Allows an animal that eats it to become a full human or a half-human hybrid, as well as grant them human-like intelligence and the ability to speak. If a human were to eat it, they would simply lose the ability to swim.",
        "Allows the user to become a full Daibutsu (a giant gold Buddha) or a half-Daibutsu hybrid.",
        "Allows the user to become a full onyudo (a monk yokai) or a half-onyudo hybrid.",
        "Allows the user to become a full falcon or a half-falcon hybrid.",
        "Allows the user to become a full phoenix or a half-phoenix hybrid.",
        "Allows the user to become a full albatross or a half-albatross hybrid.",
        "Allows the user to become a full dachshund or a half-dachshund hybrid.",
        "Allows the user to become a full jackal or a half-jackal hybrid.",
        "Allows the user to become a full wolf or a half-wolf hybrid similar to a werewolf.",
        "Allows the user to become a full tanuki or a half-tanuki hybrid.",
        "Allows the user to become a full nine-tailed fox or a half-nine-tailed fox hybrid.",
        "Allows the user to become a full Okuchi no Makami (a wolf deity) or a half-Okuchi no Makami hybrid.",
        "Allows the user to become a full horse or a half-horse hybrid.",
        "Allows the user to become a full pegasus or a half-pegasus hybrid.",
        "Allows the user to become a full leopard or a half-leopard hybrid.",
        "Allows the user to become a full saber-toothed tiger or a half-saber-toothed tiger hybrid.",
        "Allows the user to become a full elephant or a half-elephant hybrid.",
        "Allows the user to become a full mammoth or a half-mammoth hybrid.",
        "Allows the user to become a full Allosaurus or a half-Allosaurus hybrid.",
        "Allows the user to become a full Spinosaurus or a half-Spinosaurus hybrid.",
        "Allows the user to become a full Pteranodon or a half-Pteranodon hybrid.",
        "Allows the user to become a full Brachiosaurus or a half-Brachiosaurus hybrid.",
        "Allows the user to become a full Pachycephalosaurus or a half-Pachycephalosaurus hybrid.",
        "Allows the user to become a full Triceratops or a half-Triceratops hybrid.",
        "Allows the user to become a full king cobra or a half-king cobra hybrid.",
        "Allows the user to become a full anaconda or a half-anaconda hybrid.",
        "Allows the user to become a full Yamata no Orochi (an eight headed snake) or a half-Yamata no Orochi hybrid.",
        "Allows the user to become a full axolotl or a half-axolotl hybrid.",
        "Allows the user to become a full rhinoceros beetle or a half-rhinoceros beetle hybrid. The user can also fly in either form.",
        "Allows the user to become a full hornet or a half-hornet hybrid. The user can also fly in either form.",
        "Allows the user to become a full Azure Dragon or a half-Azure Dragon hybrid.",
        "Allows the user to become a Rosamygale grauvogeli or a half-Rosamygale grauvogeli hybrid.",
        "Allows the user to become a full mole or a half-mole hybrid. The user can also dig underground.",
        "Allows the user to become a full turtle or a half-turtle hybrid.",
        "Gives the user's body the properties of an egg. When the shell is destroyed, the user will regenerate from the yolk in a stronger chicken-like form."};
        answer = input.next();
        answer = answer.toUpperCase();
        
        while (!answer.equalsIgnoreCase("Exit")) {
            switch (answer) {
                case "L" -> {
                    int randomL = random.nextInt(13)+88;
                    System.out.println("Congratulations! You rolled the");
                    System.out.println(anyFruitJapanese[randomL]+", otherwise known as the "+anyFruitEnglish[randomL]+"!");
                    System.out.println(anyFruitDescription[randomL]);
                    endCredits();
                }
                    
                case "Z" -> {
                    int randomZ = random.nextInt(36)+101;
                    System.out.println("Congratulations! You rolled the");
                    System.out.println(anyFruitJapanese[randomZ]+", otherwise known as the "+anyFruitEnglish[randomZ]+"!");
                    System.out.println(anyFruitDescription[randomZ]);
                    endCredits();
                }
                    
                case "P" -> {
                    int randomP = random.nextInt(89);
                    System.out.println("Congratulations! You rolled the");
                    System.out.println(anyFruitJapanese[randomP]+", otherwise known as the "+anyFruitEnglish[randomP]+"!");
                    System.out.println(anyFruitDescription[randomP]);
                    endCredits();
                }
                    
                case "A" -> {
                    int randomA = random.nextInt(138);
                    System.out.println("Congratulations! You rolled the");
                    System.out.println(anyFruitJapanese[randomA]+", otherwise known as the "+anyFruitEnglish[randomA]+"!");
                    System.out.println(anyFruitDescription[randomA]);
                    endCredits();
                }
                
                default -> System.out.println("I'm sorry, you seem to have made a typo. Could you reenter one of the correct letters?");
            }
        answer = input.next();
        answer = answer.toUpperCase();
        }
        
    }
    
    public static void endCredits() {
    System.out.println("");
        System.out.println("Thank you for participating in the Devil Fruit Randomizer!");
        System.out.println("");
        System.out.println("If you would like to go again, please enter another letter");
        System.out.println("or type 'Exit' to quit the program!");
        System.out.println("");
}
}