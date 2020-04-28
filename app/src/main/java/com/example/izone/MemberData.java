package com.example.izone;

import java.util.ArrayList;

public class MemberData {
    private static String[] memberNames = {
            "Jang Won Young",
            "Miyawaki Sakura",
            "Jo Yu Ri",
            "Choi Ye Na",
            "Ahn Yu Jin",
            "Yabuki Nako",
            "Kwon Eun Bi",
            "Kang Hye Won",
            "Honda Hitomi",
            "Kim Chae Won",
            "Kim Min Joo",
            "Lee Chae Yeon"
    };

    private static String[] memberDetails = {
            "Jang Wonyoung (lahir di Dongbu Ichon-dong, Yongsan, Seoul, Korea Selatan, 31 Agustus 2004; umur 15 tahun) adalah seorang penyanyi asal Korea Selatan. Ia berada di bawah kontrak Starship Entertainment. Pada 2018, mengikuti acara Produce 48 dimana ia meraih peringkat pertama di episode akhir dengan total 338,366 suara dan kemudian masuk grup musik Iz One. Sebelumnya, ia tampil dalam video musik Love It Live It karya YDPP.",
            "Sakura Miyawaki (宮脇 咲良 Miyawaki Sakura, kelahiran 19 Maret 1998 di Prefektur Kagoshima) adalah seorang anggota grup perempuan idola Jepang HKT48 dan AKB48. Ia adalah wakil kapten Tim KIV HKT48 dan anggota Tim A AKB48. Pada tahun 2018, ia mengikuti Produce 48 dan mendapatkan peringkat ke-2 di episode final sehingga ia berhasil debut di girl group korea IZONE.",
            "Jo Yu-ri (Korea: 조유리; Jepang: チョユリ) (lahir di Distrik Nam, Busan, Korea Selatan, 22 Oktober 2001; umur 18 tahun) adalah seorang penyanyi Korea Selatan yang sekarang berada di bawah kontrak Stone Music Entertainment. Ia meraih peringkat ke-3 dalam Produce 48 dan menjadi anggota grup vokal perempuan Iz One.[1] Ia juga menjadi kontestan acara 2017 Idol School.",
            "Choi Ye-na (Korea: 최예나; Jepang: チェイェナ) (lahir di Seoul, Korea Selatan, 29 September 1999; umur 20 tahun) adalah seorang penyanyi asal Korea Selatan yang sekarang berada di bawah kontrak Yue Hua Entertainment. Ia meraih peringkat keempat dalam Produce 48 dan menjadi anggota grup vokal perempuan Iz One.",
            "Ahn Yu-jin (Korea: 안유진; Jepang: アンユジン) (lahir di Cheongju, Provinsi Chungcheong Utara, Korea Selatan, 1 September 2003; umur 16 tahun) adalah seorang penyanyi Korea Selatan di bawah kontrak Starship Entertaiment. Ia meraih peringkat ke-5 dalam Produce 48 dan menjadi anggota grup vokal perempuan Iz One.",
            "Nako Yabuki (矢吹奈子 Yabuki Nako, lahir di Tokyo, 18 Juni 2001; umur 18 tahun) adalah seorang penyanyi dan pemeran asal Jepang. Ia adalah anggota grup vokal perempuan HKT48 dan Iz One. Ia masuk HKT48 pada November 2013. Dari 2015 sampai 2017, ia menjadi anggota ganda AKB48. Pada 2018, ia ikut serta dalam acara survival Korea Selatan Produce 48. Ia meraih peringkat enam dan melakukan debut sebagai anggota Iz One. Ia adalah model eksklusif untuk Love Berry. Ia juga dikenal atas perannya sebagai Minami Asakura muda dalam film Touch (2005).",
            "Kwon Eunbi adalah seorang penyanyi asal Korea Selatan. Ia menjalin kontrak di bawah Woollim Entertainment. Ia melakukan debut dengan grup Ye-A dengan nama panggung Kazoo dan hengkang pada 2015. Pada 2018, ia mengikuti acara Produce 48 dan meraih peringkat ketujuh dengan total 250,212 suara pada episode terakhirnya.[1] Hasilnya, ia masuk dalam grup musik Izone ",
            "Kang Hye-won (lahir di Yangsan, Kyungnam, Korea Selatan, 5 Juli 1999; umur 20 tahun) adalah seorang penyanyi asal Korea Selatan. Ia berada di bawah kontrak dengan 8D Creative. Pada 2018, ia mengikuti acara realitas Produce 48 dan kemudian masuk grup vokal perempuan Iz One.[1] Ia masuk ke sekolah yang sama dengan salah satu anggota Iz One lainnya, Choi Ye-na. Pada masa sebelumnya, ia nyaris debut dengan DAYDAY, namun tertunda, dan The Ark, namun ia terlanjut meninggalkan perusahaannya.",
            "Hitomi Honda (lahir di Nikko, Tochigi, Jepang, 6 Oktober 2001; umur 18 tahun) adalah seorang penyanyi, penari dan idola asal Jepang. Pada 3 April 2014, ia masuk grup idola Jepang AKB48 melalui audisi kerja sama AKB48 dan Toyota, AKB48 Team 8, sebagai perwakilan Prefektur Tochigi.[1] Ia meraih peringkat ke-82 dalam pemilihan umum 2018 untuk singel ke-53 AKB48 yang diadakan pada 6 Mei 2018 dengan memperoleh 17.656 suara. Pada 31 Agustus 2018, ia mengikuti acara realitas kerja sama Jepang-Korea Selatan Produce 48 untuk membentuk sebuah grup vokal perempuan Jepang-Korea Selatan Iz One. Ia lolos dan menempati posisi ke-9 dengan 240.418 suara.",
            "Kim Chae-won (lahir di Gangnam, Seoul, Korea Selatan, 1 Agustus 2000; umur 19 tahun) adalah seorang penyanyi asal Korea Selatan. Ia berada di bawah kontrak Woollim Entertainment. Pada 2018, ia ikut serta dalam acara realitas Produce 48 dimana ia meraih peringkat sepuluh di episode akhir dengan total 238,192 suara.[1] Ia kemudian masuk grup vokal perempuan Iz One. Pada masa sebelumnya, ia tampil dalam video musik untuk 'Let Me' karya Golden Child. Kim Chaewon adalah lulusan Sekolah Multi Seni Hanlim.",
            "Kim Min Ju (Korea: 김민주; Jepang: キ ム ミ ン ジ ュ; atau  Minju) adalah penyanyi dan rapper Korea Selatan yang saat ini berada di bawah Urban Works Entertainment dan Off The Record Entertainment. Dia adalah anggota kelompok gadis proyek IZ * ONE.",
            "Lee Chae-yeon (Korea: 이채연; Jepang: イチェヨン) (lahir di Yongin, Gyeonggi-do, Korea Selatan, 11 Januari 2000; umur 20 tahun) adalah seorang penyanyi asal Korea Selatan yang sekarang berada di bawah kontrak WM Entertainment. Ia adalah mantan anggota magang JYP Entertainment dan kontestan SIXTEEN, acara survival yang membentuk grup vokal perempuan TWICE, namun tereliminasi pada Episode 3. Ia meraih peringkat ke-12 dalam Produce 48 dan menjadi anggota grup vokal perempuan Iz One."

    };

    private static int[] memberImages = {
            R.drawable.wonyoung,
            R.drawable.sakura,
            R.drawable.yuri,
            R.drawable.yena,
            R.drawable.yujin,
            R.drawable.nako,
            R.drawable.eunbi,
            R.drawable.hyewon,
            R.drawable.hitomi,
            R.drawable.chaewon,
            R.drawable.minju,
            R.drawable.chaeyeon
    };

    static ArrayList<Member> getListData() {
        ArrayList<Member> list = new ArrayList<>();
        for (int position = 0; position < memberNames.length; position++) {
            Member member = new Member();
            member.setName(memberNames[position]);
            member.setDetail(memberDetails[position]);
            member.setPhoto(memberImages[position]);
            list.add(member);
        }
        return list;
    }
}
