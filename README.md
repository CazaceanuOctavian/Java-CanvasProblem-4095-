# Java-CanvasProblem-4095-
solution
#4095 from PB info

Problem:

Deși nu obișnuiește să deseneze, Adrian are o pasiune inedită: îi place să schițeze pe hârtie orașe imaginare… mai exact cum ar arăta acestea văzute de sus. În acest an, de ziua lui a primit cadou un pergament! Normal că menirea acestuia va fi ca Adrian să deseneze pe el schița celui mai mare oraș pe care și l-a imaginat până acum.

Pergamentul are lățimea unei coli de hârtie, însă lungimea sa este neașteptat de mare. De asemenea, pergamentul este împărțit în pătrate astfel încât pe lungime se află exact N pătrate iar pe lățime se află exact K pătrate. Astfel, Adrian are la dispoziție exact N*K pătrate pe care le poate colora.

El decide să coloreze doar străzile orașului, deoarece nu are timp de mai mult și plănuiește să folosească două tipuri de străzi:

1. Străzi orizontale

Vor fi desenate ca o secvență continuă de pătrate albastre.
Pe fiecare rând de la 1 la N se va afla exact o stradă orizontală. Deci, la final vor fi exact N străzi orizontale.
Fiecare stradă se desfășoară pe un singur rând.
Lungimea fiecărei străzi va fi de minim un pătrat și de maxim K pătrate și este egală cu numărul de pătrate ce o compun.
Strada poate începe pe oricare pătrat de pe rând și poate avea orice lungime cât timp nu depășește limitele pergamentului.
2. Străzi verticale

Vor fi desenate ca o secvență continuă de pătrate roșii.
Adrian va desena exact Q străzi verticale, desfășurate pe una dintre coloanele de la 1 la K.
Pe o coloană pot exista mai multe străzi verticale cu condiția să nu se suprapună. Nu este obligatoriu să existe străzi verticale pe toate coloanele.
Lungimea fiecărei străzi va fi de minim un pătrat și de maxim N pătrate și este egală cu numărul de pătrate ce o compun.
Strada poate începe pe oricare pătrat de pe coloană și poate avea orice lungime cât timp nu depășește limitele pergamentului.
La final, Adrian observă că anumite pătrate au devenit mov, deoarece fac parte atât dintr-o stradă verticală cât și din una orizontală, deci au fost colorate atât cu roșu cât și cu albastru.
Adrian este fascinat de apariția acestora și vrea să știe câte pătrate mov sunt în desenul său. Fiind prea obosit să le numere, vă roagă pe voi să-l ajutați.

Cerința
Cunoscând numerele N, K, Q, precum și poziționarea celor N străzi orizontale și a celor Q străzi verticale, să se determine numărul de pătrate mov din pergament.

Date de intrare
Pe prima linie a fișierului de intrare pergament.in se află trei numere naturale separate prin cate un spațiu: N K Q, cu semnificația din enunț.

Pe a doua linie se află patru numere naturale separate prin câte un spațiu: A B C D.

Pe a treia linie se află două numere naturale X[1] Y[1], unde X[1] reprezintă coloana pătratului de început al străzii orizontale de pe rândul 1, iar Y[1] reprezintă lungimea acesteia.

Datele următoarelor N-1 străzi se vor calcula prin formulele de mai jos, unde X[i] reprezintă coloana pătratului de început al străzii orizontale de pe rândul i (2 ≤ i ≤ N), iar Y[i] reprezintă lungimea acesteia:

X[i] = 1 + (X[i - 1] * A + B) \% K
Y[i] = 1 + (Y[i - 1] * C + D) % (K - X[i] + 1)
Pe următoarele Q linii se află câte trei numere naturale J R L, unde J reprezintă coloana pe care se află strada verticală, R reprezintă rândul pe care se află pătratul de început al străzii, iar L reprezintă lungimea străzii.

Date de ieșire
În fișierul de ieșire pergament.out se va afla un singur număr natural ce reprezintă numărul de pătrate mov din desenul lui Adrian.

Restricții și precizări
1 ≤ N ≤ 10.000.000
1 ≤ K ≤ 50
1 ≤ Q ≤ 100.000
1 ≤ A, B, C, D ≤ 10.000.000
1 ≤ X[i] ≤ K
1 ≤ Y[i] ≤ K - X + 1
1 ≤ J ≤ K
1 ≤ R ≤ N
1 ≤ L ≤ N - R + 1
Rândurile sunt numerotate de la 1 la N, iar coloanele sunt numerotate de la 1 la K
Pentru 40 puncte N ≤ 20.000
Pentru 70 de puncte N ≤ 500.000
Pentru 100 de puncte nu există condiții adiționale.
