/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parsistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "peminjaman_skripsi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeminjamanSkripsi.findAll", query = "SELECT p FROM PeminjamanSkripsi p")
    , @NamedQuery(name = "PeminjamanSkripsi.findByIdPetugas", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.idPetugas = :idPetugas")
    , @NamedQuery(name = "PeminjamanSkripsi.findByIdPeminjam", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.idPeminjam = :idPeminjam")
    , @NamedQuery(name = "PeminjamanSkripsi.findByNoPeminjaman", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.noPeminjaman = :noPeminjaman")
    , @NamedQuery(name = "PeminjamanSkripsi.findByTanggalPinjam", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.tanggalPinjam = :tanggalPinjam")
    , @NamedQuery(name = "PeminjamanSkripsi.findByTanggalKembali", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.tanggalKembali = :tanggalKembali")
    , @NamedQuery(name = "PeminjamanSkripsi.findByKeterangan", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.keterangan = :keterangan")
    , @NamedQuery(name = "PeminjamanSkripsi.findByStatus", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.status = :status")
    , @NamedQuery(name = "PeminjamanSkripsi.findByNamaPeminjam", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.namaPeminjam = :namaPeminjam")
    , @NamedQuery(name = "PeminjamanSkripsi.findByIdSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.peminjamanSkripsiPK.idSkripsi = :idSkripsi")})
public class PeminjamanSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeminjamanSkripsiPK peminjamanSkripsiPK;
    @Column(name = "tanggal_pinjam")
    @Temporal(TemporalType.DATE)
    private Date tanggalPinjam;
    @Column(name = "tanggal_kembali")
    @Temporal(TemporalType.DATE)
    private Date tanggalKembali;
    @Column(name = "keterangan")
    private String keterangan;
    @Column(name = "status")
    private String status;
    @Column(name = "nama_peminjam")
    private String namaPeminjam;
    @JoinColumn(name = "id_peminjam", referencedColumnName = "id_peminjam", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Peminjam peminjam;
    @JoinColumn(name = "id_petugas", referencedColumnName = "id_petugas", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Petugas petugas;
    @JoinColumn(name = "id_skripsi", referencedColumnName = "id_skripsi", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Skripsi skripsi;

    public PeminjamanSkripsi() {
    }

    public PeminjamanSkripsi(PeminjamanSkripsiPK peminjamanSkripsiPK) {
        this.peminjamanSkripsiPK = peminjamanSkripsiPK;
    }

    public PeminjamanSkripsi(String idPetugas, String idPeminjam, String noPeminjaman, String idSkripsi) {
        this.peminjamanSkripsiPK = new PeminjamanSkripsiPK(idPetugas, idPeminjam, noPeminjaman, idSkripsi);
    }

    public PeminjamanSkripsiPK getPeminjamanSkripsiPK() {
        return peminjamanSkripsiPK;
    }

    public void setPeminjamanSkripsiPK(PeminjamanSkripsiPK peminjamanSkripsiPK) {
        this.peminjamanSkripsiPK = peminjamanSkripsiPK;
    }

    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public Peminjam getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public Skripsi getSkripsi() {
        return skripsi;
    }

    public void setSkripsi(Skripsi skripsi) {
        this.skripsi = skripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peminjamanSkripsiPK != null ? peminjamanSkripsiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsi)) {
            return false;
        }
        PeminjamanSkripsi other = (PeminjamanSkripsi) object;
        if ((this.peminjamanSkripsiPK == null && other.peminjamanSkripsiPK != null) || (this.peminjamanSkripsiPK != null && !this.peminjamanSkripsiPK.equals(other.peminjamanSkripsiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parsistence.PeminjamanSkripsi[ peminjamanSkripsiPK=" + peminjamanSkripsiPK + " ]";
    }
    
}
