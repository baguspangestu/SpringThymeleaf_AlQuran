package com.irvanudin.uts.models;

import java.util.List;
import java.util.Map;

public class SuratModel {
    private int code;
    private String message;
    private Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        private int nomor;
        private String nama;
        private String namaLatin;
        private int jumlahAyat;
        private String tempatTurun;
        private String arti;
        private String deskripsi;
        private Map<String, String> audioFull;
        private List<Ayat> ayat;
        private Object suratSelanjutnya;
        private Object suratSebelumnya;
    
        public int getNomor() {
            return nomor;
        }
    
        public void setNomor(int nomor) {
            this.nomor = nomor;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getNamaLatin() {
            return namaLatin;
        }
    
        public void setNamaLatin(String namaLatin) {
            this.namaLatin = namaLatin;
        }
    
        public int getJumlahAyat() {
            return jumlahAyat;
        }
    
        public void setJumlahAyat(int jumlahAyat) {
            this.jumlahAyat = jumlahAyat;
        }
    
        public String getTempatTurun() {
            return tempatTurun;
        }
    
        public void setTempatTurun(String tempatTurun) {
            this.tempatTurun = tempatTurun;
        }
    
        public String getArti() {
            return arti;
        }
    
        public void setArti(String arti) {
            this.arti = arti;
        }
    
        public String getDeskripsi() {
            return deskripsi;
        }
    
        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }
    
        public Map<String, String> getAudioFull() {
            return audioFull;
        }

        public void setAudioFull(Map<String, String> audioFull) {
            this.audioFull = audioFull;
        }
    
        public List<Ayat> getAyat() {
            return ayat;
        }
    
        public void setAyat(List<Ayat> ayat) {
            this.ayat = ayat;
        }
    
        public Object getSuratSelanjutnya() {
            return suratSelanjutnya;
        }
    
        public void setSuratSelanjutnya(Object suratSelanjutnya) {
            this.suratSelanjutnya = suratSelanjutnya;
        }
    
        public Object getSuratSebelumnya() {
            return suratSebelumnya;
        }
    
        public void setSuratSebelumnya(Object suratSebelumnya) {
            this.suratSebelumnya = suratSebelumnya;
        }
    }

    public static class Ayat {
        private int nomorAyat;
        private String teksArab;
        private String teksLatin;
        private String teksIndonesia;
        private Map<String, String> audio;
    
        public int getNomorAyat() {
            return nomorAyat;
        }
    
        public void setNomorAyat(int nomorAyat) {
            this.nomorAyat = nomorAyat;
        }
    
        public String getTeksArab() {
            return teksArab;
        }
    
        public void setTeksArab(String teksArab) {
            this.teksArab = teksArab;
        }
    
        public String getTeksLatin() {
            return teksLatin;
        }
    
        public void setTeksLatin(String teksLatin) {
            this.teksLatin = teksLatin;
        }
    
        public String getTeksIndonesia() {
            return teksIndonesia;
        }
    
        public void setTeksIndonesia(String teksIndonesia) {
            this.teksIndonesia = teksIndonesia;
        }
    

        public Map<String, String> getAudio() {
            return audio;
        }

        public void setAudio(Map<String, String> audio) {
            this.audio = audio;
        }
    }
}

