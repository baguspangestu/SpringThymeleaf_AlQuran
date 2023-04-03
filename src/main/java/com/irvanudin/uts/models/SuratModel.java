package com.irvanudin.uts.models;

import java.util.List;
import java.util.Map;

public class SuratModel {
    private int code;
    private String message;
    private List<Surat> data;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<Surat> getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(List<Surat> data) {
        this.data = data;
    }

    public static class Surat {
        private int nomor;
        private String nama;
        private String namaLatin;
        private int jumlahAyat;
        private String tempatTurun;
        private String arti;
        private String deskripsi;
        private Map<String, String> audioFull;

        public int getNomor() {
            return nomor;
        }

        public String getNama() {
            return nama;
        }

        public String getNamaLatin() {
            return namaLatin;
        }

        public int getJumlahAyat() {
            return jumlahAyat;
        }

        public String getTempatTurun() {
            return tempatTurun;
        }

        public String getArti() {
            return arti;
        }

        public String getDeskripsi() {
            return deskripsi;
        }

        public Map<String, String> getAudioFull() {
            return audioFull;
        }

        public void setNomor(int nomor) {
            this.nomor = nomor;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setNamaLatin(String namaLatin) {
            this.namaLatin = namaLatin;
        }

        public void setJumlahAyat(int jumlahAyat) {
            this.jumlahAyat = jumlahAyat;
        }

        public void setTempatTurun(String tempatTurun) {
            this.tempatTurun = tempatTurun;
        }

        public void setArti(String arti) {
            this.arti = arti;
        }

        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }

        public void setAudioFull(Map<String, String> audioFull) {
            this.audioFull = audioFull;
        }
    }
}
