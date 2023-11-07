LAPORAN 9 menggunakan persistance dan CSV 

kelebihan persistance yaitu bisa melakukan load object secara langsung 

pada laporan ini menggunakan kasus yang sama seperti sebelumnya, hanya saja laporan sebelumnya menggunakan JDBC 

langkah-langkahnya sama seperti sebelumnya, hanya saja yang diubah codingannya 


MEMBUAT CSV 
CSV dibuat pada MS.EXCEL bertujuan untuk memudahkna user menginputkan data secara otomatis 

langkah-langkah membuat CSV: 
1. pada tampilan GUI menambahkan button baru 'IMPOR'
2. membuat csv pada excel dan diisi beberapa data 
3. pada kode button 'impor' unutk membaca file CSV, memparsing data, dan menyimpan ke database dengan JPA. 
4. lalu run program tersebut, jika CSV berhasil maka data nya akan muncul dalam tabel. 