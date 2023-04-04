package com.irvanudin.uts.models;

import java.util.List;
import java.util.Map;

public class TafsirModel {
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
        private List<Tafsir> tafsir;
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
    
        public List<Tafsir> getTafsir() {
            return tafsir;
        }
    
        public void setTafsir(List<Tafsir> tafsir) {
            this.tafsir = tafsir;
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

    public static class Tafsir {
        private int ayat;
        private String teks;
    
        public int getAyat() {
            return ayat;
        }
    
        public void setAyat(int ayat) {
            this.ayat = ayat;
        }
    
        public String getTeks() {
            return teks;
        }
    
        public void setTeks(String teks) {
            this.teks = teks;
        }
    }
}

