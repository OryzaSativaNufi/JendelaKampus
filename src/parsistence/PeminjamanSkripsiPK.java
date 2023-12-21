/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parsistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ASUS
 */
@Embeddable
public class PeminjamanSkripsiPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_petugas")
    private String idPetugas;
    @Basic(optional = false)
    @Column(name = "id_peminjam")
    private String idPeminjam;
    @Basic(optional = false)
    @Column(name = "no_peminjaman")
    private String noPeminjaman;
    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;

    public PeminjamanSkripsiPK() {
    }

    public PeminjamanSkripsiPK(String idPetugas, String idPeminjam, String noPeminjaman, String idSkripsi) {
        this.idPetugas = idPetugas;
        this.idPeminjam = idPeminjam;
        this.noPeminjaman = noPeminjaman;
        this.idSkripsi = idSkripsi;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getIdPeminjam() {
        return idPeminjam;
    }

    public void setIdPeminjam(String idPeminjam) {
        this.idPeminjam = idPeminjam;
    }

    public String getNoPeminjaman() {
        return noPeminjaman;
    }

    public void setNoPeminjaman(String noPeminjaman) {
        this.noPeminjaman = noPeminjaman;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPetugas != null ? idPetugas.hashCode() : 0);
        hash += (idPeminjam != null ? idPeminjam.hashCode() : 0);
        hash += (noPeminjaman != null ? noPeminjaman.hashCode() : 0);
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsiPK)) {
            return false;
        }
        PeminjamanSkripsiPK other = (PeminjamanSkripsiPK) object;
        if ((this.idPetugas == null && other.idPetugas != null) || (this.idPetugas != null && !this.idPetugas.equals(other.idPetugas))) {
            return false;
        }
        if ((this.idPeminjam == null && other.idPeminjam != null) || (this.idPeminjam != null && !this.idPeminjam.equals(other.idPeminjam))) {
            return false;
        }
        if ((this.noPeminjaman == null && other.noPeminjaman != null) || (this.noPeminjaman != null && !this.noPeminjaman.equals(other.noPeminjaman))) {
            return false;
        }
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parsistence.PeminjamanSkripsiPK[ idPetugas=" + idPetugas + ", idPeminjam=" + idPeminjam + ", noPeminjaman=" + noPeminjaman + ", idSkripsi=" + idSkripsi + " ]";
    }
    
}
