# Relasi Kelas

## Kompetensi

Setelah menempuh pokok bahasan ini, mahasiswa mampu:

1. Memahami konsep relasi kelas;
2. Mengimplementasikan relasi _has‑a_ dalam program.

## Pendahuluan

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pada kasus yang lebih kompleks, dalam suatu sistem akan ditemukan lebih dari satu _class_ yang saling memiliki keterkaitan antara _class_ satu dengan yang lain. Pada percobaan‑percobaan sebelumnya, mayoritas kasus yang sudah dikerjakan hanya fokus pada satu _class_ saja. Pada jobsheet ini akan dilakukan percobaan yang melibatkan beberapa _class_ yang saling berelasi.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Misalnya terdapat _class_ Laptop yang memiliki atribut berupa merk dan prosesor. Jika diperhatikan lebih rinci, maka atribut prosesor sendiri didalamnya memiliki data berupa merk, nilai _cache_ memori, dan nilai _clock_‑nya. Artinya, ada _class_ lain yang namanya Processor yang memiliki atribut merk, _cache_ dan _clock_, dan atribut prosesor yang ada di dalam _class_ Laptop itu merupakan objek dari _class_ Proceessor tersebut. Sehingga terlihat antara _class_ Laptop dan _class_ Processor memiliki relasi (_has‑a_).

![Contoh Relasi Class Laptop dan Processor](/relasi-kelas/img/contohrelasi1.png)

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jenis relasi _has‑a_ ini yang akan dicontohkan pada percobaan di jobsheet ini. Apabila dilihat lebih rinci lagi, relasi tersebut disebut juga dengan agregasi (_has-a_). Relasi antar kelas yang lain adalah dependensi (_uses-a_) dan _inheritance_ (_is-a_). Diperlukan inisiatif mandiri dari tiap mahasiswa untuk memperdalam jenis relasi lain terutama yang tidak dibahas pada mata kuliah ini
