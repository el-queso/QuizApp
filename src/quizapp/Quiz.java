package quizapp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane; //Package for Error
import javax.swing.Timer; //Timer package
import java.awt.event.*; //Timer package
import java.util.Random; //Random package


public class Quiz extends javax.swing.JFrame {
    
    
    
    
    
    
    
    
    ///////////////////////////////////////////
    //Setting Timer  
    int min=3;
    int sec=0;
    Timer T= new Timer(1000, new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
            boolean check=true;//A flag that helps us with if statements
            if (sec==0){ //Checking the seconds and passing minutes
                min--;
                sec=60;
                
            }
            if (min<0){//If we reach this point that means we run out of time
                    JOptionPane.showMessageDialog(rootPane, "Time's Up", "Game Over", 0); //A popup Error when time is over
                    min=sec=0; //Setting Minutes and seconds back to 0 and stoping the timer
                    T.stop();
                    new result(correct_guesses).setVisible(true); //Going to result page
                    setVisible(false);
            }else{
                sec--; 
                if (sec<10){//This statement is for printing 05:09 etc and not 05:9 etc 
                    jTimer.setText("0"+min+":"+"0"+sec);
                    check=false;
                }
                if (check){ //We are all set if we reach this point
                    jTimer.setText("0"+min+":"+sec);
                }
            }
            
        }
    });

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); //To change body of generated methods, choose Tools | Templates.
    }
    ///////////////////////////////////////////        

   
   String[] questions = 	{
                                                                //Sports        								
                                                                "Σε πόσους τελικούς Μουντιάλ έχει αγωνιστεί ο Βραζιλιάνος Καφού;",
								"Ποιος είναι ο γηραιότερος παγκόσμιος πρωταθλητής στην ιστορία του μποξ;",
                                                                "Ποιο είναι το παγκόσμιο ρεκόρ που κατέχει ο Γιουσέιν Μπολτ στα 100 μέτρα;",
                                                                "Σε ποιά ομάδα έχει παίξει ο Michael Jordan εκτώς απο τους Chicago Bulls;",
                                                                "Πόσα σερί πρωταθλήματα κατέκτησε με τη Φεράρι ο Michael Schumacher στη Φόρμουλα 1;",
                                                                "Πόσα λεπτά κρατάει θεωριτικά μία περίοδος στην υδατοσφαίριση;",
                                                                "Κάθε πόσα χρόνια γίνεται το Ευρωπαϊκό Πρωτάθλημα ποδοσφαίρου;",
                                                                "Ποιό απο τα παρακάτω αθλήματα δεν ανοίκει στο Δέκαθλο;",
                                                                "Σε ποιά χώρα εφευρέθηκε το Κρίκετ;",
                                                                "Ποιό απο τα παρακάτω δεν θεωρείται άθλημα;",
                                                                // Zoo
                                                                "Ποιανού ζώου η εγκυμοσύνη κρατάει 5 μήνες;",
                                                                "Με πόσα θηλυκά ζευγαρώνει ένας κύκνος;",
                                                                "Κάθε πότε μπορεί να γεννήσει μια κουνέλα;",
                                                                "Πόσα μωρά γεννάει μια γουρούνα σε κάθε γέννα;",
                                                                "Πόσα χρόνια ζει μια χελώνα της ξηράς;",
                                                                "Πόσα πόδια έχει μια ακρίδα;",
                                                                "Πόσα περίπου μύδια τρώει ενας Θαλάσσιος ίππος κάθε μέρα;",
                                                                "Ποιο ζώο πηδά έξω από το νερό για να επικοινωνήσει με άλλους του είδους του;",
                                                                "Ποιο πουλί μπορεί να πετάξει ευθεία, κάτω και προς τα πίσω;",
                                                                "Ποιο ζώο είναι το μόνο ιπτάμενο θηλαστικό;",
                                                                //Movies
                                                                "Ποιο είναι το όνομα της μαμάς του Simba στον Βασιλιά των Λιονταριών",
                                                                "Σε ποια χώρα καταλήγει ο Nemo όταν χωρίζεται από τον μπαμπά του;",
                                                                "Ποιος διάσημος ηθοποιός παίζει τον Burt στην Mary Poppins;",
                                                                "Πόσες φορές υπήρξε στα Όσκαρ ισοπαλία;",
                                                                "Ποιος απ' τους παρακάτω κατάφερε να κάνει το Όσκαρ back-to-back (να κερδίσει δύο συνεχόμενες χρονιές);",
                                                                "Σε ποια δεκαετία κυκλοφόρησε η Disney την Χιονάτη και τους επτά νάνους;",
                                                                "Ποιός διάσημος κωμικός είναι ο πρωταγωνιστής στην ταινία \"Η Μάσκα\";",
                                                                "Πόσοι ηθοποιοί που έπαιξαν ως τώρα τον James Bond έχουν πάρει όσκαρ στην καριέρα τους;",
                                                                "Ποιός απο τους παρακάτω ειναι ο σκηνοθέτης στην ελληνική ταινία \"Θεία από το Σικάγο\";",
                                                                "Σε ποια ελληνική ταινία ακούγεται η διάσημη ατάκα \"Έχω και κότερο. Πάμε μια βόλτα;\";",
                                                                //geography
                                                                "Που βρίσκεται η Γουινέα:",
                                                                "Που βρίσκεται το Καρπενήσι;",
                                                                "Ποσά κατοικημένα νησιά έχουν τα επτανησα;",
                                                                "Ποιο νησί από τα παρκάτω είναι το μεγαλύτερο;",
                                                                "Ποσά κατοικημένα  νησιά έχει η Ελλάδα;",
                                                                "Ποια πολιτεία της Αμερικής είναι γνωστή ως η Χρυσή Πολιτεία;",
                                                                "Ποια είναι η πρωτεύουσα της Χαβάη;",
                                                                "Σε ποιά ήπειρο ανοίκει το Λιχτενστάιν;",
                                                                "Ποιο είναι το δεύτερο μεγαλύτερο νησί της χώρας;",
                                                                "Ποια είναι η μεγαλύτερη σε έκταση λίμνη της Ελλάδας;",
                                                                //Music
                                                                "Ποιού συγκροτήματος ειναι μέλος ο BD Foxmoor;",
                                                                "Σε ποιο δίσκο του Βασίλη Παπακωνσταντίνου περιλαμβάνεται το τραγούδι «Πάρε με»;",
                                                                "Σε ποιό album των Scorpions ανήκει το τραγούδι \"Send me an Angel\";",
                                                                "Ποιά χώρα ήταν νικήτρια στην eurovision το 2006;",
                                                                "Ποιος στιχουργός έγραψε το τραγούδι \"Πίνω και μεθώ\";",
                                                                "Πόσες χορδές έχει μια άρπα;",
                                                                "Ποιο γνωστό ροκ συγκρότημα κατάγεται από την πόλη Αθήνα της Τζόρτζια;",
                                                                "Ποιος ήταν ο πρώτος δίσκος των Guns N' Roses  που κυκλοφόρησε το 1987;",
                                                                "Από ποια χώρα κατάγονται οι AC/DC;",
                                                                "Τι είδους μουσικό όργανο είναι το αρχαιότερο μουσικό όργανο που έχει ανακαλυφθεί;",
                                                                //History
                                                                "Πότε εκλέχτηκε τελευταία φορά ο Γιώργος Παπανδρέου ο 1ος;",    
                                                                "Σε ποιά χώρα ξεκίνησε η βιομηχανική επανάσταση;",
                                                                "Πότε έφτασε για πρώτη φορά ο Χριστόφορος Κολόμβος στην Αμερική;",
                                                                "Πότε έγινε το πραξικοπημα των συνταγματαρχων στην Ελλάδα;",
                                                                "Ποσα περίπου χρονια διηρκησε η τουρκοκρατια στην Θεσσαλονικη;",
                                                                "Ποιος πόλεμος εισήγαγε για πρώτη φορά τη χρήση των τανκς;",
                                                                "Ποσα χρονια διήρκησε η εκστρατεία του Μεγάλου Αλεξάνδρου;",
                                                                "Πότε καταλήφθηκε η Κρήτη απο τους Γερμανούς;",
                                                                "Πότε έγινε η Μικρασιατική καταστροφή;",
                                                                "Πότε γίνανε οι Βαλκανικοί πόλεμοι;",
                                                                //Games
                                                                "Ποιο ήταν το πρώτο εμπορικά επιτυχημένο βιντεοπαιχνίδι;",
                                                                "Ποιο είναι το βιντεοπαιχνίδι με τις καλύτερες πωλήσεις όλων των εποχών;",
                                                                "Τι είναι το \"frag\";",
                                                                "Πόσες κονσόλες Playstation 4 έχουν πουληθεί;",
                                                                "Ποιά εταιρία έφτιαξε το παιχνίδι Mario Bros;",
                                                                "Τι ενέπνευσε τον κατασκευαστή παιχνιδιών Satoshi Tajiri να δημιουργήσει το Pokémon;",
                                                                "Ποιο ήταν το αρχικό όνομα του Sonic;",
                                                                "Πως λέγεται η φανταστική γλώσσα που μιλιέται στο The Sims;",
                                                                "Πάνω σε τι σχήμα βασίστηκε το σχήμα της πίστας του Pac-Man;",
                                                                "Τι ρίχνουν τα \"zombies\" στο Minecraft;",
                                                                //Health
                                                                "Πόσα χρωμοσώματα έχει ένα ανθρώπινο σώμα;",
                                                                "Πόσα δόντια έχουν οι ενήλικες?",
                                                                "Περίπου τι ποσοστό οξυγόνου περιέχει ο αέρας που εκπνέει ένας άνθρωπος;",
                                                                "Ποιος μικροοργανισμός ευθύνεται για τους περισσότερους θανάτους ανθρώπων στην Ιστορία;",
                                                                "Που βρίσκονται οι κυψελίδες στο ανθρώπινο σώμα;",
                                                                "Η ανθρώπινη καρδιά μέσα σε ποιο διαμέρισμα στη θωρακική περιοχή βρίσκεται;",
                                                                "Ποια είναι η προτεινόμενη διάρκεια πλυσίματος των χεριών με αλκοολούχο αντισηπτικό;",
                                                                "Ποιο απο τα παρακάτω δεν θεωρείται αποστειρωτικό μέσο;",
                                                                "Σε ποιά κατηγορία ανήκουν τα χειρουργικά εργαλεία;",
                                                                "Απο ποιά ομάδα αίματος μπορεί να πάρει αίμα ένας ασθενής με 0 αρνητικό;",
                                                                //Science
                                                                "Πως λέγεται η διαδικασία μετατροπής της φωτεινής ενέργειας σε χημική?",
                                                                "Ποιος είναι ο μεγαλύτερος πλανήτης σε σύνθεση και μάζα;",
                                                                "Πόσος χρόνος χρειάζεται για να περιστραφεί η Γη γύρω από τον Ήλιο;",
                                                                "Πόσο χρόνο περίπου χρειάζεται το φως για να φτάσει από τη Γη στη Σελήνη;",
                                                                "Ποιο είναι το λαμπρότερο άστρο στο νυχτερινό ουρανό;",
                                                                "Ποιό απο τα παρακάτω είναι θεωριτικά αδύνατο;",
                                                                "Τι αποδίδει το πεντοξείδιο του αζώτου σε αντίδραση με νερό;",
                                                                "Πώς λέγεται ο τόπος όπου τα ρεύματα και τα ποτάμια γλυκού νερού συναντούν τη θάλασσα;",
                                                                "Ποιο από αυτά τα χημικά στοιχεία είναι βαρύτερο από το σίδηρο;",
                                                                "Σε τι αναφέρεται η εξίσωση E = mc2;",
                                                                //Technology
                                                                "Πότε βγήκε στην αγορά το πρώτο iPhone;",
                                                                "Ποιος εφηύρε το λειτουργικό σύστμα \"unix\";",
                                                                "Ποιος εφηύρε το MS-DOS",
                                                                "Ποια απο τις παρακάτω ειναι η μεγαλύτερη εταιρία πληροφορικής στον κόσμο;",
                                                                "Ποιός εφηύρε τον παγκόσμιο ιστό(Word Wide Web);",
                                                                "Ποια εφαρμογή κοινωνικών μέσων σας επιτρέπει να βλέπετε μόνο εικόνες και μηνύματα για περιορισμένο χρονικό διάστημα;",
                                                                "Ποιο ήταν το όνομα της πρώτης μηχανής αναζήτησης στο Διαδίκτυο που δημιουργήθηκε το 1990;",
                                                                "Πως λέγεται η γλώσσα προγραμματισμού υπολογιστών που χρησιμοποιείται για τη στοιχειοθέτηση τεχνικών εγγράφων;",
                                                                "Ποιό λειτουργικό σύστημα ανέπτυξε η Google;",
                                                                "Τι σημαίνει το VPN;"
                                                                };
	String[][] options = 	{                                 
								//Sport
                                                                {"Κανέναν","2","3","4"},
                                                                {"Muhammad Ali","Bernard Hopkins","George Foreman","Shane Mosley"},
                                                                {" 9.68","9.63","8.90","9.58 "},
                                                                {"Washington Wizards","Denver Nuggets","Brooklyn Nets","Golden State Warriors"},
                                                                {"7","3","5","0"},
                                                                {"8","10","15","4"},
                                                                {"4","2","1","6"},
                                                                {"Δισκοβολία","Άλμα επι κοντό","Άρση βαρών","Σφαιροβολία"},
                                                                {"Γαλλία","Ισαλνδία","Γερμανία","Αγγία"},
                                                                {"Σκάκι","Βελάκια","Μπόουλινγκ","Πόκερ"},
                                                                //Ζoo
								{"Του αλόγου","Της κατσίκας","Της αγελάδας","Του γουρουνιου"},
								{"Με 1","Με 3","Με 5","Με 7"},
								{"Κάθε μήνα","Κάθε 2 μήνες","Κάθε 3 μήνες","Κάθε 4 μήνες"},
                                                                {"1-3","4-6","6-9","9-12"},
                                                                {"1-20","20-50","50-100","Πάνω απο 100"},
                                                                {"8","6","2","4"},
                                                                {"5,000","10,000","12,000","16,000"},
                                                                {"Ιπτάμενο ψάρι","Κροκόδειλος","Φάλαινα","Καρχαρίας"},
                                                                {"Περιστέρι","Κολίβριο πουλί","Αετός","Παπαγάλος"},
                                                                {"Νυχτερίδα","Ιπτάμενος σκίουρος","Πελαργός","Αετός"},
                                                                //Movies
                                                                {"Nala","Nakia","Sarabi ","Shuri"},
                                                                {"Στην Αυστραλία","Στην Αμερική","Στην Ελλάδα","Στην Μεγάλη Βρετανία"},
                                                                {"Ο Paul Newman","O Peter Fonda","Ο Tom Hanks","O Dick Van Dyke"},
                                                                {"6","1","Καμία","3"},
                                                                {"Liam Neeson","Tom Hanks","Jack Nicholson","Johnny Depp"},
                                                                {"1950","1920","1930","1940"},
                                                                {"Έντι Μέρφι","Τζόνα Χιλ","Τζιμ Κάρεϊ","Γουίλ Φέρελ"},
                                                                {"Κανένας","Ένας","Όλοι","Οι 2 πρώτοι"},
                                                                {"Νίκος Τσιφόρος","Αλέκος Σακελλάριος","Γιάννης Δαλιανίδης","Ντίνος Δημόπουλος"},
                                                                {"Κορίτσια για φίλημα","Ο Καζανόβας","Τζένη-Τζένη","Το ανθρωπάκι"},
                                                                //Geography
                                                                {"Αφρική","Αυστραλία ","Αμερική","Ασία"},
                                                                {"Δωδεκανησα","Επτάνησα","Ροδόπη","Ευρυτανία"},
                                                                {"7","17","10","15"},
                                                                {"Κεφαλονιά","Λέσβος","Ρόδος","Χίος"},
                                                                {"107 ","127","227","327"},
                                                                {"Νιου Τζέρσεϊ","Τέξας","Φλόριντα","Καλιφόρνια"},
                                                                {"Οάχου","Χίλο","Χονολουλού","Καχουλούι"},
                                                                {"Αυστραλία","Ευρώπη","Ασία","Αφρική"},
                                                                {"Ρόδος","Κέρκυρα","Κρήτη","Εύβοια"},
                                                                {"Τριχωνίδα","Βόλβη","Μεγάλη Πρέσπα","Βεγορίτιδα"},
                                                                //Music
                                                                {"Active Member","TXC","FFC","Ημισκούμπρια"},
                                                                {"Ελλας","Χαιρετίσματα","Χρόνια Πολλά","Διαίρεση"},
                                                                {"Crazy World","Lovedrive","Face The Heat","Love at First Sting"},
                                                                {"Ελλάδα(Αννα Βίση)","Γερμανία(Texas Lightning)","Φιλανδία(Lordi)","Λιθουανία(LT United)"},
                                                                {"Περιστέρης Σπύρος","Ευτυχία Παπαγιαννοπούλου"," Μίμης Τραϊφόρος","Νίκος Γκάτσος"},
                                                                {"62","20","15","46"},
                                                                {"U2","REM","Aerosmith","Scorpions"},
                                                                {"Use Your Illusion I","Appetite for Destruction","Chinese Democracy","\"The Spaghetti Incident?\""},
                                                                {"Γερμανία","Αγγλία","Γαλλία","Αυστραλία"},
                                                                {"Κρουστό","Πνευστό","Εγχορδο","Πληκτροφόρο"},
                                                                //History
                                                                {"1964","1954","1960","1958"},
                                                                {" Γερμανία","Γαλλία","Μεγάλη Βρετανία","Ιταλία"},
                                                                {"1492","1607","1421","1504"},
                                                                {"1963","1965","1967","1969"},
                                                                {"300","400","500","600"},
                                                                {"Πόλεμος των τριαντάφυλλων","1ος Παγκόσμιος Πόλεμος","Στην Ισπανικη κατακτηση της Αμερικης","2ος Παγκόσμιος Πόλεμος"},
                                                                {"11","5","24","8"},
                                                                {"1959","1932","1941","1965"},
                                                                {"1922","1940","1912","1915"},
                                                                {"1915-1916","1911-12","1912-1913","1919-1920"},
                                                                //Games
                                                                {"Pong","Donkey Kong","Super Mario Bros","Shaq Fu"},
                                                                {"Red Dead Redemption 2","FIFA 2018","Minecraft","Call of Duty: Modern Warfare 3"},
                                                                {"O αριθμός των πραγμάτων που \"σκοτώσατε\" στο παιχνίδι","Cheat Code","Ισοπαλία ","Νίκη"},
                                                                {"5 εκατομμύρια","56 εκατομμύρια","62.5 εκατομμύρια","Πάνω απο 100 εκατομμύρια"},
                                                                {"Sega","Nintendo","Sony","Mojang"},
                                                                {"Ένα όνειρο","Πεταλούδες","Μια παλία τηλεοπτική σειρά","Η μητέρα του"},
                                                                {"Steven","Mr Needlemouse","Colin the Hedgehog","Fast Blue Hedgehog"},
                                                                {"Simian","Simlish","Simali","Simento"},
                                                                {"Σχήμα πίτσας","Σχήμα λεμονιού","Σχήμα καρπουζιού","Σχήμα σπιτιού"},
                                                                {"Σκουπίδια","Φίλτρα","Σπόρους λουλουδιών","Σάπια σάρκα"},
                                                                //Health
                                                                {"23","2","46","58"},
                                                                {"20","24","28","32"},
                                                                {"0%","1-2%","50%","14-16%"},
                                                                {"Mycobacterium tuberculosis (Φυματίωση)","HIV (AIDS)","Yesinia pestis (Βουβωνική πανώλη)","Plasmodium falciparum (ελονοσία)"},
                                                                {"Στην στοματική κοιλοτητα","Στους πνεύμονες","Στο πάγκρεας","Στον θυρεοειδή αδένα"},
                                                                {"Οπίσθιο μεσοθωράκιο","Κατώτερο μεσοθωράκιο","Mεσαίο μεσοθωράκιο","Ανώτερο μεσοθωράκιο"},
                                                                {"30 δευτερόλεπτα","45 δευτερόλεπτα","1 λεπτό","2 λεπτά"},
                                                                {"Ξηρή θερμότητα","Υγρή θερμότητα","Αλκόολη","Υπεροξείδιο του υδρογόνου"},
                                                                {"Κρίσιμα","Ημι κρίσιμα","Μη κρίσιμα","Κανένα απο τα παραπάνω"},
                                                                {"0 θετικό","ΑΒ αρνητικό","Β αρνητικό","0 αρνητικό"},
                                                                //Science
                                                                {"Χλωροφύλλη","Βλάστηση","Διαπνοή","Φωτοσύνθεση"},
                                                                {"Δίας","Κρόνος","Ουρανός","Ποσειδώνας"},
                                                                {"24 ώρες","6 μήνες","1 χρόνο","3 μήνες"},
                                                                {"1 λεπτό","20 δευτερόλεπτα","5 λεπτά","1 δευτερόλεπτο"},
                                                                {"Σείριος","Αλντεμπαράν","Πολικός Αστέρας","Α του Κενταύρου"},
                                                                {"Δυαδική Μαύρη τρύπα","Δυαδικός γαλαξίας","Δυαδικό νετρόνιο αστέρι","Κανένα απο τα παραπάνω"},
                                                                {"Νιτρικό οξύ","Υδροχλωρικό οξύ","Οξείδιο του αζώτου II","Οξείδιο του αζώτου III"},
                                                                {"Τέλμα","Εκβολή","Έλος","Τυφιά"},
                                                                {"Χρυσός","Μαγγάνιο","Κάλιο","Ανθρακας"},
                                                                {"Θεωρία της γενικής σχετικότητας","Κβαντική θεωρία πεδίου","Νόμος της αδράνειας","Θεωρία της ειδικής σχετικότητας"},
                                                                //Technology
                                                                {"2007","2006","2008","2009"},
                                                                {"Bill Gates","Linus Torvalds","Steve Jobs","Dennis Ritchie"},
                                                                {"Bill Gates","Steve Jobs","Dennis Ritchie","Tim Paterson"},
                                                                {"Samsung Electronics","Google","Microsoft","Apple"},
                                                                {"Mark Zuckerberg","Yukihiro Matsumoto","Bill Gates","Tim Berners-Lee"},
                                                                {"Instagram","WhatsApp","Viber","Snapchat"},
                                                                {"Yahoo","Archie","DuckDuckGo","Bing"},
                                                                {"LaTeX","LISP","SGML","SQL"},
                                                                {"BlackBerry OS","iOS","Android","Windows"},
                                                                {"Visual Protocol Networking","Visual Processing Network","Virtual Private Network","Visual Protocol Network"},};
	char[] answers =    {
								//Sports
                                                                'C',
								'B',
								'D',
								'A',
                                                                'C',
                                                                'A',
                                                                'A',
                                                                'C',
                                                                'D',
                                                                'D',
                                                                //Zoo
                                                                'B',
                                                                'A',
                                                                'A',
                                                                'D',
                                                                'D',
                                                                'B',
                                                                'A',
                                                                'C',
                                                                'B',
                                                                'A',
                                                                //Movies
                                                                'C',
                                                                'A',
                                                                'D',
                                                                'A',
                                                                'B',
                                                                'C',
                                                                'C',
                                                                'B',
                                                                'B',
                                                                'A',
                                                                //Geography
                                                                'A',
                                                                'D',
                                                                'B',
                                                                'B',
                                                                'A',
                                                                'D',
                                                                'C',
                                                                'B',
                                                                'D',
                                                                'A',
                                                                //Music
                                                                'A',
                                                                'B',
                                                                'A',
                                                                'C',
                                                                'A',
                                                                'D',
                                                                'B',
                                                                'B',
                                                                'D',
                                                                'B',
                                                                //History
                                                                'A',
                                                                'C',
                                                                'A',
                                                                'C',
                                                                'C',
                                                                'B',
                                                                'A',
                                                                'C',
                                                                'A',
                                                                'C',
                                                                //Games
                                                                'A',
                                                                'C',
                                                                'A',
                                                                'D',
                                                                'B',
                                                                'B',
                                                                'B',
                                                                'B',
                                                                'A',
                                                                'D',
                                                                //Health
                                                                'A',
                                                                'D',
                                                                'D',
                                                                'D',
                                                                'B',
                                                                'C',
                                                                'A',
                                                                'C',
                                                                'A',
                                                                'D',
                                                                //Science
                                                                'D',
                                                                'A',
                                                                'C',
                                                                'D',
                                                                'A',
                                                                'D',
                                                                'A',
                                                                'B',
                                                                'A',
                                                                'D',
                                                                //Technology
                                                                'A',
                                                                'D',
                                                                'D',
                                                                'D',
                                                                'D',
                                                                'D',
                                                                'B',
                                                                'A',
                                                                'C',
                                                                'C',};
        char guess;
	char answer;
	int index;
	int correct_guesses =0;
	int total_questions = questions.length;
	int result;
	int seconds=10; 
        boolean start=true;
        int cat1=8;
        int cat2=4;
        int i=0;
        int max1,max2,min1,min2,flag=0;
       
        int pin1[] = {0,0,0,0,0,0,0,0,0,0};

    Quiz(int index1, int index2) {
       cat1=index1;
       cat2=index2;
       initComponents();
    }
        

        

    
        
        
        private void catemethod(){
            if(cat1==1){
                min1=0;
                max1=9;}
            else if (cat1==2){
                min1=10;
                max1=19;}
            else if (cat1==3){
                min1=20;
                max1=29;}
            else if (cat1==4){
                min1=30;
                max1=39;}
            else if (cat1==5){
                min1=40;
                max1=49;}
            else if (cat1==6){
                min1=50;
                max1=59;}
            else if (cat1==7){
                min1=60;
                max1=69;}
            else if (cat1==8){
                min1=70;
                max1=79;}
            else if (cat1==9){
                min1=80;
                max1=89;}
            else if (cat1==10){
                min1=90;
                max1=99;}
            
           if(cat2==1){
               min2=0;
               max2=9;}
            else if (cat2==2){
                min2=10;
                max2=19;}
            else if (cat2==3){
                min2=20;
                max2=29;}
            else if (cat2==4){
                min2=30;
                max2=39;}
            else if (cat2==5){
                min2=40;
                max2=49;}
            else if (cat2==6){
                min2=50;
                max2=59;}
            else if (cat2==7){
                min2=60;
                max2=69;}
            else if (cat2==8){
                min2=70;
                max2=79;}
            else if (cat2==9){
                min2=80;
                max2=89;}
            else if (cat2==10){
                min2=90;
                max2=99;}
            
        } 
            
           
               
                
                
                
                
                
                    
        
        
        
      private int randommethod1(){
          int index1;
          Random rand = new Random(); 
          if(flag<6){
         
          do{
          index1=rand.nextInt((max1-min1)+1)+min1;
         }while(pin1[0]==index1 || pin1[1]==index1 || pin1[2]==index1 || pin1[3]==index1 || pin1[4]==index1);
            pin1[i]=index1;
            i++;
      return index1;
          }else
          {
          
          do{
          index1=rand.nextInt((max2-min2)+1)+min2;
         }while(pin1[5]==index1 || pin1[6]==index1 || pin1[7]==index1 || pin1[8]==index1 || pin1[9]==index1);
            pin1[i]=index1;
            i++;
            return index1;
          }
          
      }
  
        
    public Quiz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aButton = new javax.swing.JRadioButton();
        cButton = new javax.swing.JRadioButton();
        bButton = new javax.swing.JRadioButton();
        dButton = new javax.swing.JRadioButton();
        jTimer = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        questionText = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aButton.setBackground(new java.awt.Color(255, 255, 255));
        aButton.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        aButton.setText("γιαννης");
        aButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, new java.awt.Color(102, 0, 102), java.awt.Color.darkGray, java.awt.Color.gray)));
        aButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aButton.setVisible(false);
        aButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aButtonActionPerformed(evt);
            }
        });
        getContentPane().add(aButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 290, -1));

        cButton.setBackground(new java.awt.Color(255, 255, 255));
        cButton.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        cButton.setText("jRadioButton2");
        cButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, new java.awt.Color(102, 0, 102), java.awt.Color.darkGray, java.awt.Color.gray)));
        cButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cButton.setVisible(false);
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 290, -1));

        bButton.setBackground(new java.awt.Color(255, 255, 255));
        bButton.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        bButton.setText("jRadioButton3");
        bButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, new java.awt.Color(102, 0, 102), java.awt.Color.darkGray, java.awt.Color.gray)));
        bButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bButton.setVisible(false);
        bButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 290, -1));

        dButton.setBackground(new java.awt.Color(255, 255, 255));
        dButton.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        dButton.setText("jRadioButton4");
        dButton.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, new java.awt.Color(102, 0, 102), java.awt.Color.darkGray, java.awt.Color.gray)));
        dButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dButton.setVisible(false);
        dButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 290, -1));

        jTimer.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTimer.setText("03:00");
        jTimer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 120, 40));

        nextButton.setBackground(new java.awt.Color(51, 51, 51));
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ArrpwNext.png"))); // NOI18N
        nextButton.setToolTipText("");
        nextButton.setBorder(null);
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nextButton.setMaximumSize(new java.awt.Dimension(201, 113));
        nextButton.setMinimumSize(new java.awt.Dimension(201, 113));
        nextButton.setPreferredSize(new java.awt.Dimension(201, 113));
        nextButton.setVisible(false);
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 180, 70));

        backButton.setForeground(new java.awt.Color(240, 240, 240));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ArrowBack.png"))); // NOI18N
        backButton.setToolTipText("");
        backButton.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 100));

        questionText.setEditable(false);
        questionText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextActionPerformed(evt);
            }
        });
        getContentPane().add(questionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 930, 40));

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startButton.setText("start");
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 100, 50));

        resultButton.setVisible(false);
        resultButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ResultButtoncrop.png"))); // NOI18N
        resultButton.setBorderPainted(false);
        resultButton.setContentAreaFilled(false);
        resultButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.setVisible(false);
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resultButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 470, 250, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/7.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, new java.awt.Color(102, 0, 102), java.awt.Color.darkGray, java.awt.Color.gray)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aButtonActionPerformed
        aButton.setEnabled(false);
        bButton.setEnabled(false);
        cButton.setEnabled(false);
        dButton.setEnabled(false);

        if(evt.getSource()==aButton) {
				answer= 'A';
				if(answer == answers[index]) {
					correct_guesses++;
                                        aButton.setForeground(Color.green);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                        dButton.setForeground(Color.red);
				}
                                 answer= 'B';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.GREEN);
                                        cButton.setForeground(Color.red);
                                
                                }
                                 answer= 'C';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.GREEN);
                                
                                }
                                 answer= 'D';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.green);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                }
			}
    }//GEN-LAST:event_aButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       this.setVisible(false);
        new StrartPage().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
     
    if (flag==9){
        nextButton.setVisible(false);
        resultButton.setVisible(true);
        min=0;sec=0; 
        T.stop();
    }
       
        
    if(!startButton.equals(evt)){
        flag++;
            index=randommethod1();
            questionText.setText(questions[index]);
            aButton.setText(options[index][0]);
            bButton.setText(options[index][1]);		
            cButton.setText(options[index][2]);
			dButton.setText(options[index][3]);
                        aButton.setEnabled(true);
                        bButton.setEnabled(true);
                        cButton.setEnabled(true);
                        dButton.setEnabled(true);
                        cButton.setForeground(Color.black);
                        aButton.setForeground(Color.black);
                        bButton.setForeground(Color.black);
                        dButton.setForeground(Color.black);
                        aButton.setSelected(false);
                        bButton.setSelected(false);
                        cButton.setSelected(false);
                        dButton.setSelected(false);
         
    }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void questionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextActionPerformed
        
    }//GEN-LAST:event_questionTextActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
       
        T.start();
        flag=1;
        catemethod();
        index=randommethod1();
        questionText.setText("Question "+(index));
	questionText.setText(questions[index]);
	aButton.setText(options[index][0]);
	bButton.setText(options[index][1]);
	cButton.setText(options[index][2]);
	dButton.setText(options[index][3]);
        startButton.setVisible(false);
        startButton.setEnabled(false);
        nextButton.setVisible(true);
        nextButton.setEnabled(true);
        aButton.setVisible(true);
        bButton.setVisible(true);
        cButton.setVisible(true);
        dButton.setVisible(true);
                         
    }//GEN-LAST:event_startButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        aButton.setEnabled(false);
        bButton.setEnabled(false);
        cButton.setEnabled(false);
        dButton.setEnabled(false);
   
        if(evt.getSource()==cButton) {
				answer= 'C';
				if(answer == answers[index]) {
					correct_guesses++;
                                        cButton.setForeground(Color.green);
                                        aButton.setForeground(Color.red);
                                        bButton.setForeground(Color.red);
                                        dButton.setForeground(Color.red);
				}
                                 answer= 'A';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.GREEN);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                
                                }
                                answer= 'B';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.GREEN);
                                        cButton.setForeground(Color.red);
                                
                                }
                                 answer= 'D';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.green);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                
                                }
			
			}
    }//GEN-LAST:event_cButtonActionPerformed

    private void bButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bButtonActionPerformed
       aButton.setEnabled(false);
    bButton.setEnabled(false);
    cButton.setEnabled(false);
    dButton.setEnabled(false);
   
    if(evt.getSource()==bButton) {
				answer= 'B';
				if(answer == answers[index]) {
					correct_guesses++;
                                        bButton.setForeground(Color.green);
                                        cButton.setForeground(Color.red);
                                        dButton.setForeground(Color.red);
                                        aButton.setForeground(Color.red);
				}
                                answer= 'A';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.GREEN);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                
                                }
                                 answer= 'C';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.GREEN);
                                
                                }
                                 answer= 'D';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.green);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                
                                }
			
			}
    }//GEN-LAST:event_bButtonActionPerformed

    private void dButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButtonActionPerformed
        aButton.setEnabled(false);
    bButton.setEnabled(false);
    cButton.setEnabled(false);
    dButton.setEnabled(false);
   
    if(evt.getSource()==dButton) {
				answer= 'D';
				if(answer == answers[index]) {
					correct_guesses++;
                                        dButton.setForeground(Color.green);
                                        aButton.setForeground(Color.red);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                }
                                answer= 'A';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.GREEN);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.red);
                                
                                }
                                 answer= 'B';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.GREEN);
                                        cButton.setForeground(Color.red);
                                
                                }
                                  answer= 'C';
                                if(answer == answers[index])
                                {       dButton.setForeground(Color.RED);
                                        aButton.setForeground(Color.RED);
                                        bButton.setForeground(Color.red);
                                        cButton.setForeground(Color.GREEN);
                                
                                }
                                
                                
                                
                                    
			
			}
    }//GEN-LAST:event_dButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        this.setVisible(false);
        new result(correct_guesses).setVisible(true);  
       }//GEN-LAST:event_resultButtonActionPerformed
	
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz().setVisible(true);
            }
        });
   
    
    
    
    
    
    
    
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aButton;
    private javax.swing.JRadioButton bButton;
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton cButton;
    private javax.swing.JRadioButton dButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jTimer;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField questionText;
    private javax.swing.JButton resultButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
