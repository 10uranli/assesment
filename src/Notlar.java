//Bir mototu thisle yazman demek özyinelemeli demek.
//Görüldüðü gibi ferrari ve bmw olmak üzere iki abstract class var.
//abstraclarda normal metodda yazýlabilir.Soyutlanmýþ abstractta yazýlabilir.
//Abstract ferraride olan abstact metotu bmw de kullanýlmak zorunda deðil.Çünkü bmxde soyut bir class(abstract)
//Eðer bmw de stop override edilmezse Normal class Day1 DE kullanýlmak zorunda.
//Ama bmw ye override edersen day1de etmeye gerek yok
//Ve day1 bmw yi extend ediyor bmw ise ferrariyi yani day1 hem bmw hemde ferrariden miras alýyor.

//#Encopsulation
/*Private: Sýnýfa özel deðiþkenlerdir.
Public: Herkese açýk olan deðiþkenlerdir.
Protected: Extends edenlere türetenlere ve ayný pakette olanlara açýk olan deðiþkenlerdir.
Default: Hiçbirþey yazýlmazsa ayný pakettekilerin eriþebildiði deðiþkenlerdir.
Sýralama Public(class field method), protected (field method), <pacgake>(class,field method), private (field method)
*/

// bmw extends car elinde var
// bmw nesne = new bmw(); Doðru
//Car nesne = new bmw(); Doðru
//bmw nesne = new Car(); Yanlýþ
//2. doðru olma nedeni her bmw nesnesi bir car nesnesidir.
