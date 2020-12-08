package com.rendi.resepmakanan;

import java.util.ArrayList;

public class DataResep {
    private static String[] resepName = {
            "Semur Ayam Kecap",
            "Asem-asem daging",
            "Capcay  Sepecial",
            "Indomie seblak macaroni",
            "Tumis jamur tiram",
            "Oseng kacang panjang",
            "Soup kimlo bakso",
            "Telur dadar gulung ",
            "Kangkung telur puyuh",
            "Soun Goreng Sepecial",
            "Tumis buncis ati ampela",
            "Nasi goreng sapi ",
            "Cucawis cah jamur"
    };

    private static String[] follower = {
            "  1.121\nfollower ",
            "  3.242\nfollower ",
            "  2.343\nfollower ",
            "  2.344\nfollower ",
            "  4.543\nfollower ",
            "  5.434\nfollower ",
            "  4.543\nfollower ",
            "  4.543\nfollower ",
            "  3.451\nfollower ",
            "  3.453\nfollower ",
            "  1.234\nfollower ",
            "  2.312\nfollower ",
            "  2.344\nfollower "
    };

    private static String[] pembaca = {
            "     121\nPembaca",
            "     312\nPembaca",
            "     231\nPembaca",
            "     231\nPembaca",
            "     451\nPembaca",
            "     524\nPembaca",
            "     451\nPembaca",
            "     451\nPembaca",
            "     341\nPembaca",
            "     341\nPembaca",
            "     100\nPembaca",
            "     192\nPembaca",
            "     123\nPembaca"
    };

    private static String[] resepDetail = {
                    "Bahan-bahan\n" +
                    "1.Kecap Bango Manis\n" +
                    "2.Yang diperlukan:\n" +
                    "3.Bango Kecap Manis\n" +
                    "4.Royco Kaldu Rasa Ayam\n\n" +
                    "Bahan utama:\n" +
                    "1. ½ ekor ayam, potong 6 bagian dan goreng hingga setengah matang\n" +
                    "2. 3 buah kentang, kupas dan potong agak besar dan goreng hingga matang\n" +
                    "3. 1 batang serai, memarkan\n" +
                    "4. 100 ml Bango Kecap Manis\n" +
                    "5. 1 bungkus Royco Kaldu Ayam\n" +
                    "6. ½ butir pala, parut\n" +
                    "7. ½ sdt lada putih bubuk\n" +
                    "8. ¼ sdt garam\n" +
                    "9. 1 L air\n" +
                    "10. 3 sdm minyak sayur\n" +
                    "11. 2 sdm bawang merah goreng\n\n" +
                    "Bumbu halus :\n" +
                    "12. 5 siung bawang putih\n" +
                    "13. 5 butir bawang merah\n" +
                    "14. 2 cm jahe\n\n" +
                    "Cara membuat :\n" +
                    "1 .Tumis bumbu halus dan serai hingga harum. Masukkan ayam dan aduk rata.\n" +
                    "\n" +
                    "2. Tambahkan kentang, Bango Kecap Manis, Royco Kaldu Ayam, pala, merica, garam, dan air. Aduk dan didihkan.\n" +
                    "\n" +
                    "3. Kecilkan api, lanjutkan memasak hingga ayam matang dan kuah mengental.\n" +
                    "\n" +
                    "4.Sajikan selagi hangat.\n" +
                    "\n" +
                    "Setelah tersaji, kamu bisa menaburkan bawang merah goreng, wijen untuk tambahan tekstur renyah dan aromanya yang khas. Coba juga olahan ayam lain yang mudah dibuat seperti resep sup ayam dan ayam bakar atau resep makanan yang hits seperti ayam geprek mozarella.\n" +
                    "\n",



            "Bahan-bahan:\n" +
                    "- 1/4 daging rebus lalu potong kotak-kotak\n" +
                    "- Buncis iris-iris (sesuai selera)\n" +
                    "- 8 bawang merah\n" +
                    "- 6 bawang putih iris-iris\n" +
                    "- 4 daun jeruk\n" +
                    "- 2 daun salam\n" +
                    "- 2 ruas jari jahe\n" +
                    "- 2 ruas jari laos + sereh\n" +
                    "- 15 cabai ijo iris-iris + cabai rawit utuh (sesuai selera)\n" +
                    "- 2 tomat ijo\n" +
                    "- 3 belimbing wuluh\n" +
                    "- garam, gula pasir, penyedap non msg\n" +
                    "- kecap manis\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Tumis bawang merah dan putih, kemudian cabai ijo\n" +
                    "2. Lalu tuang ke rebusan daging dan masakan semua bumbu kecuali belimbing wuluh dan tomat masak sampai mendidih\n" +
                    "3. Masukkan buncis\n" +
                    "4. Masukkan tomat dan belimbing, garam, gula, penyedap, kecap manis.\n\n",






            "Bahan :\n" +
                    "- 100 gr kembang kol\n" +
                    "- 150 gr brokoli\n" +
                    "- 5 buah jagung muda, potong serong\n" +
                    "- 50 gr wortel\n" +
                    "- 20 ekor udang kupas\n" +
                    "- 3 siung bawang putih, cincang halus\n" +
                    "- 2 siung bawang merah iris\n" +
                    "- Larutan maizena secukupnya\n" +
                    "- 200 ml air\n" +
                    "- 3 sdm minyak untuk menumis\n" +
                    "\n" +
                    "Bumbu :\n" +
                    "- secukupnya garam\n" +
                    "- 1 setengah sdt kaldu jamur totole\n" +
                    "- Setengah sdt lada\n" +
                    "\n" +
                    "Cara memasak:\n" +
                    "1. Tumis bawang putih dan bawang merah hingga berwarna kekuningan\n" +
                    "2. Masukkan udang dan wortel, tumis beberapa saat. Lalu masukkan brokoli dan kembang kol, tumis sampai tercampur rata.\n" +
                    "3. Masukkan jagung muda. Aduk lagi. Masukkan air\n" +
                    "4. Masak hingga mendidih dengan api sedang, tambahkan bumbu\n" +
                    "5. Lakukan tes rasa, terakhir beri larutan maizena sedikit demi sedikit hingga kentalnya pas\n" +
                    "6. Matikan api, angkat dan sajikan capcay selagi hangat.\n\n",





            "Bahan-bahan:\n" +
                    "- 1 bungkus Indomie (mi rasa ayam bawang) rebus.\n" +
                    "- 30 gram macaroni rebus tiriskan\n" +
                    "- sedikit kerupuk bawang mentah rendam air panas hingga empuk beri sedikit minyak supaya tidak lengket\n" +
                    "- secukupnya daun bawang iris\n" +
                    "- 1 buah sosis iris\n" +
                    "- 1buah telur kocok lepas\n" +
                    "- 2 gelas air\n" +
                    "- sedikit garam, gula dan bumbu indomi\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                    "- 3 bawang merah\n" +
                    "- 2 bawang putih\n" +
                    "- 5 cabai merah keriting\n" +
                    "- 3 rawit atau sesuai selera\n" +
                    "- 1 cm kencur\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Tumis bumbu halus dengan sedikit minyak\n" +
                    "2. masukkan air, setelah mendidih masukkan kocokan telur diaduk\n" +
                    "3. masukkan macaroni, lalu sosis kerupuk dan mi, beri gula garam bumbu indomi\n" +
                    "4. aduk rata test rasa angkat sajikan taburi dengan daun bawang.\n\n",






            "Bahan-bahan:\n" +
                    "- 2 bungkus jamur tiram\n" +
                    "- 1/2 papan tempe\n" +
                    "- 4 siung bawang merah\n" +
                    "- 3 siung bawang putih\n" +
                    "- 5 buah cabai hijau\n" +
                    "- saus tiram\n" +
                    "- kaldu jamur\n" +
                    "- garam dan gula\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Cuci bersih jamur, siangi, sisihkan\n" +
                    "2. Goreng tempe setengah kering. Sisihkan\n" +
                    "3. Tumis dua bawang dan cabai sampai harum, masukkan jamur, aduk rata, tambahkan saus tiram, kaldu jamur, gula dan garam. Aduk rata\n" +
                    "4. Masukkan tempe, beri sedikit air, masak sampai bumbu meresap. Angkat dan sajikan.\n\n",






            "Bahan-bahan:\n" +
                    "- 12 buah kacang panjang\n" +
                    "- 1 buah tempe\n" +
                    "- 2 papan pete dikupas kulit\n" +
                    "- 5 bawang putih diiris\n" +
                    "- 4 bawang merah diiris\n" +
                    "- 5 buah cabai merah diiris\n" +
                    "- 1 ruas lengkuas digeprek\n" +
                    "- 1 ruas jahe digeprek\n" +
                    "- 1 serai digeprek\n" +
                    "- 2 daun salam\n" +
                    "- 2 daun jeruk\n" +
                    "- 2 sdm kecap manis\n" +
                    "- 1 sdm saus tiram\n" +
                    "- 1 sdt gula pasir\n" +
                    "- 1/2 sdt garam\n" +
                    "- air putih\n" +
                    "- minyak goreng.\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Potong-potong kacang panjang cuci bersih dan sisihkan. Potong kecil-kecil tempe dan digoreng sebentar. Angkat dan tiriskan\n" +
                    "2. Siapkan wajan beri minyak goreng secukupnya. Tumis bawang merah dan putih sampai layu lalu masukkan lengkuas, jahe ,serai, daun salam dan daun jeruk, cabai merah. Aduk rata. Masukkan kacang panjang dan pete oseng-oseng lalu beri kecap manis, saus tiram, gula dan garam aduk rata beri sedikit air\n" +
                    "3. Koreksi rasa dan terakhir masukkan tempe goreng oseng-oseng sebentar sampai semua bahan tercampur rata. Lalu matikan api dan sajikan.\n\n",







            "Bahan-bahan:\n" +
                    "- Bakso sapi secukupnya atau ganti telur puyuh rebus sesuai selera\n" +
                    "- Jamur kuping secukupnya, potong sesuai selera\n" +
                    "- Soun, rendam sebentar dengan air biasa, tiriskan\n" +
                    "- Wortel secukupnya, potong-potong\n" +
                    "- 1-2 dada ayam fillet, rebus sebentar, suwir\"\n" +
                    "- Kacang kapri secukupnya\n" +
                    "- Daun bawang dan seledri secukupnya\n" +
                    "- Bawang goreng secukupnya\n" +
                    "- Minyak goreng utk menumis bumbu\n" +
                    "- 1/2 siung bawang bombay, cincang halus/kasar\n" +
                    "- 3-4 siung bawang putih, cincang halus\n" +
                    "- 2 cm jahe, iris\n" +
                    "- 1/2 sdt lada bubuk\n" +
                    "- 1/2 pala bubuk\n" +
                    "- Garam & kaldu bubuk secukupnya\n" +
                    "- 800 ml\n" +
                    "- 1 liter air kaldu ayam/sapi.\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Tumis bawang putih, bawang bombay dan jahe hingga harum, tumbuhan pala bubuk dan lada bubuk, aduk rata\n" +
                    "2. Tambahkan air kaldu sesuai selera, biarkan sampai mendidih\n" +
                    "3. Tambahkan wortel, biarkan hingga setengah matang, lalu tambahkan bakso, ayam suwir, kacang kapri, jamur kuping dan kaldu bubuk, garam, masak semua hingga matang\n" +
                    "4. Beberapa saat sebelum api dimatikan, tambahkan daun bawang\n" +
                    "5. Sajikan dengan bawang goreng dan seledri.\n\n",






            "Bahan-bahan:\n" +
                    "- 5 butir telur\n" +
                    "- 2 sdm terigu\n" +
                    "- air minum kurang lebih 70 cc\n" +
                    "- garam, penyedap\n" +
                    "- 1/2 batang wortel dipotong kecil-kecil\n" +
                    "\n" +
                    "Bahan untuk saos:\n" +
                    "- 2 sdm kacang polong\n" +
                    "- 5 cm jahe dipotong korek api\n" +
                    "- 3 sdm saos tomat\n" +
                    "- 1/2 sdm kecap manis\n" +
                    "- 1 sdm tepung maizena\n" +
                    "- 200 cc air\n" +
                    "- 1 buah jeruk kunci\n" +
                    "- garam, penyedap jamur, dan gula pasir lebih kurang 2 sdm sesuai selera ya\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Larutkan terigu dengan air, garam, penyedap, masukkan wortel, telor kocok lepas\n" +
                    "2. Panaskan teflon pakai api sedang tuang kocokan telur tunggu sebentar kemudian gulung telur gulungnya jangan sampai habis. Sisakan pinggirnya buat sambungan gulungan telur biar tidak putus\n" +
                    "3. Ulangi lagi sampai adonan telur habis. Angkat sisihkan\n" +
                    "4. Untuk saosnya, masukkan semua bahan saos kecuali larutan maizena di teflon yang habis goreng gulungan telur. Tunggu mendidih sebentar, koreksi rasa baru masukkan larutan maizena\n" +
                    "5. Angkat dan siram di atas potongan gulungan telur siap disajikan.\n\n",






            "Bahan-bahan:\n" +
                    "- 1 ikat besar kangkung petiki\n" +
                    "- 15 butir telur puyuh rebus kupas\n" +
                    "- 1/2 buah bawang bombay rajang\n" +
                    "- 3 butir bawang putih cincang halus\n" +
                    "- 2 sdm tauco asin\n" +
                    "- 1 sdm saus tiram\n" +
                    "- Kecap asin sesuai selera\n" +
                    "- Kecap manis sesuai selera\n" +
                    "- Kaldu jamur bubuk sesuai selera\n" +
                    "- 1 sdt merica hitam tumbuk\n" +
                    "- 1 gelas air\n" +
                    "- larutan 1 sdt tepung maizena + sedikit air\n" +
                    "- minyak untuk menumis\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Tumis bawang putih dan bawang bombay hingga wangi. Masukkan tauco disusul saus tiram, kecap asin, kecap manis, kaldu bubuk dan merica\n" +
                    "2. Masukkan kangkung tumis hingga layu lalu tuang air, jika sudah mendidih masukkan telur puyuh.\n" +
                    "3. Tuangkan larutan tepung maizena sedikit demi sedikit sambil terus diaduk hingga mengental. Koreksi rasa. Jika sudah matang matikan api. Angkat dan sajikan segera.\n\n",






            "Bahan :\n" +
                    "- 1 bgks soun\n" +
                    "- 150 gr ayam fillet\n" +
                    "- 2 butir telur, kocok lepas\n" +
                    "- 1 buah wortel, iris korek api\n" +
                    "- 2 buah cabai merah keriting, iris\n" +
                    "- 15 buah buncis, iris serong\n" +
                    "- 4 siung bawang putih, cincang\n" +
                    "- 2 butir bawang merah , cincang\n" +
                    "- Kecap manis secukupnya\n" +
                    "- 1 sdm minyak wijen\n" +
                    "- Garam, merica secukupnya\n" +
                    "- Sedikit air\n" +
                    "- 2 sdm kecap ikan\n" +
                    "\n" +
                    "Cara membuatnya:\n" +
                    "1. Rendam soun sampai lembut, tiriskan beri kecap manis, minyak wijen dan kecap ikan aduk rata, sisihkan\n" +
                    "2. Tumis bawang merah dan bawang putih hingga harum lalu masukkan ayam aduk hingga berubah warna masukkan juga telur diamkan sebentar aduk asal\n" +
                    "3. Tambahkan cabai merah, buncis dan wortel aduk-aduk tuangkan sedikit air beri garam dan merica serta kaldu jamur aduk rata, diamkan beberapa saat lalu masukkan sounnya aduk terus hingga semua bumbu tercampur rata, tes rasa, angkat dan sajikan.\n\n",


            "Bahan-bahan:\n" +
                    "- 150 gr buncis, siangi, potong\n" +
                    "- 50 gr jagung muda, potong\n" +
                    "- 2 pasang ati ampela rebus, potong\n" +
                    "- 1/4 bawang bombai, cincang\n" +
                    "- 2 siung bawang putih, cincang\n" +
                    "- 5 cabai merah keriting, iris serong\n" +
                    "- 10 cabai rawit hijau, iris tipis\n" +
                    "- 1/2 buah tomat, iris\n" +
                    "- 1 sdm saus tiram\n" +
                    "- 1/2 sdt merica bubuk\n" +
                    "- Garam, gula\n" +
                    "- 100 ml air\n" +
                    "- 2 sdm minyak goreng\n" +
                    "\n" +
                    "Cara memasak:\n" +
                    "1. Panaskan minyak, tumis bawang bombai dan bawang putih sampai harum, masukkan cabai, aduk rata\n" +
                    "2. Masukkan ati ampela, aduk sampai agak kering, masukkan tomat, buncis dan jagung muda, aduk sampai layu, beri air. Bubuhi garam, gula, merica, dan saus tiram, aduk rata, koreksi rasa. Masak sampai tingkat kematangan yang disukai\n" +
                    "3. Sajikan dengan nasi putih hangat.\n\n",





            "Bahan:\n" +
                    "- 3 porsi nasi\n" +
                    "- 3 lembar daun jeruk\n" +
                    "- 4 sdm kecap manis\n" +
                    "- sedikit daging sapi\n" +
                    "- 1 butir telur\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                    "- 1 kemiri\n" +
                    "- 1/2 sdt merica\n" +
                    "- 3 siung bawang putih\n" +
                    "- 3 siung bawang merah\n" +
                    "- 2 sdt kaldu bubuk\n" +
                    "- 1 cabai merah besar\n" +
                    "- 1 cabai rawit domba\n" +
                    "\n" +
                    "Cara memasak:\n" +
                    "1. Potong kecil daging sapi lalu tumis sampai matang.\n" +
                    "2. Haluskan bumbu. Masukkan dalam sapi dan beri daun jeruk aduk. Sisihkan di pinggiran wajan.\n" +
                    "3. Masak telur orak arik. Masukkan nasi, aduk rata.\n" +
                    "4. Tambahkan kaldu bubuk, merica dan kecap. Aduk sampai matang.\n\n",





            "Bahan:\n" +
                    "- 200 gram cuciwis, belah dua, cuci bersih\n" +
                    "- 100 gram jamur champignon, iris tipis\n" +
                    "- 5 siung bawang putih, cincang\n" +
                    "- 1 sdm saus tiram\n" +
                    "- Garam secukupnya\n" +
                    "- 1/4 sdt gula pasir\n" +
                    "- 1/4 sdt merica bubuk\n" +
                    "- 100 ml air\n" +
                    "- 2 sdm minyak goreng\n" +
                    "\n" +
                    "Cara membuat:\n" +
                    "1. Panaskan minyak, tumis bawang putih sampai harum dan kekuningan, angkat, sisihkan\n" +
                    "2. Masukkan jamur, aduk sampai layu, masukkan cuciwis, masak sampai layu\n" +
                    "3. Masukkan air, bumbui dengan garam, gula, merica, dan saus tiram, aduk rata. Masak sampai matang. Sajikan dengan taburan bawang putih goreng.\n\n"
    };

    private static int[] resepPhoto = {
            R.drawable.semur,
            R.drawable.asem_asem,
            R.drawable.capcay,
            R.drawable.indomiseblak,
            R.drawable.tumis_jamur,
            R.drawable.oseng_kacang,
            R.drawable.sup_kimlo,
            R.drawable.telur_dadar,
            R.drawable.kangkung_telur,
            R.drawable.soun_goreng,
            R.drawable.tumis_buncis,
            R.drawable.nasi_goreng,
            R.drawable.cucah_rawis
    };

    static ArrayList<Resep> getListData() {
        ArrayList<Resep> list = new ArrayList<>();
        for (int position = 0; position < resepName.length; position++) {
            Resep resep = new Resep();
            resep.setName(resepName[position]);
            resep.setDetail(resepDetail[position]);
            resep.setPhoto(resepPhoto[position]);
            resep.setFollower(follower[position]);
            resep.setPembaca(pembaca[position]);
            list.add(resep);
        }
        return list;
    }
}

