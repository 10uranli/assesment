//Bir mototu thisle yazman demek �zyinelemeli demek.
//G�r�ld��� gibi ferrari ve bmw olmak �zere iki abstract class var.
//abstraclarda normal metodda yaz�labilir.Soyutlanm�� abstractta yaz�labilir.
//Abstract ferraride olan abstact metotu bmw de kullan�lmak zorunda de�il.��nk� bmxde soyut bir class(abstract)
//E�er bmw de stop override edilmezse Normal class Day1 DE kullan�lmak zorunda.
//Ama bmw ye override edersen day1de etmeye gerek yok
//Ve day1 bmw yi extend ediyor bmw ise ferrariyi yani day1 hem bmw hemde ferrariden miras al�yor.

//#Encopsulation
/*Private: S�n�fa �zel de�i�kenlerdir.
Public: Herkese a��k olan de�i�kenlerdir.
Protected: Extends edenlere t�retenlere ve ayn� pakette olanlara a��k olan de�i�kenlerdir.
Default: Hi�bir�ey yaz�lmazsa ayn� pakettekilerin eri�ebildi�i de�i�kenlerdir.
S�ralama Public(class field method), protected (field method), <pacgake>(class,field method), private (field method)
*/

// bmw extends car elinde var
// bmw nesne = new bmw(); Do�ru
//Car nesne = new bmw(); Do�ru
//bmw nesne = new Car(); Yanl��
//2. do�ru olma nedeni her bmw nesnesi bir car nesnesidir.
