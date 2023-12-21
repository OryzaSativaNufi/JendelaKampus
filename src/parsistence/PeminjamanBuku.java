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
@Table(name = "peminjaman_buku")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PeminjamanBuku.findAll", query = "SELECT p FROM PeminjamanBuku p")
    , @NamedQuery(name = "PeminjamanBuku.findByIdPetugas", query = "SELECT p FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.idPetugas = :idPetugas")
    , @NamedQuery(name = "PeminjamanBuku.findByIdPeminjam", query = "SELECT p FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.idPeminjam = :idPeminjam")
    , @NamedQuery(name = "PeminjamanBuku.findByNoPeminjaman", query = "SELECT p FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.noPeminjaman = :noPeminjaman")
    , @NamedQuery(name = "PeminjamanBuku.findByTanggalPinjam", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalPinjam = :tanggalPinjam")
    , @NamedQuery(name = "PeminjamanBuku.findByTanggalKembali", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggalKembali = :tanggalKembali")
    , @NamedQuery(name = "PeminjamanBuku.findByKeterangan", query = "SELECT p FROM PeminjamanBuku p WHERE p.keterangan = :keterangan")
    , @NamedQuery(name = "PeminjamanBuku.findByStatus", query = "SELECT p FROM PeminjamanBuku p WHERE p.status = :status")
    , @NamedQuery(name = "PeminjamanBuku.findByNamaPeminjam", query = "SELECT p FROM PeminjamanBuku p WHERE p.namaPeminjam = :namaPeminjam")
    , @NamedQuery(name = "PeminjamanBuku.findByIdBuku", query = "SELECT p FROM PeminjamanBuku p WHERE p.peminjamanBukuPK.idBuku = :idBuku")})
public class PeminjamanBuku implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PeminjamanBukuPK peminjamanBukuPK;
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
    @JoinColumn(name = "id_buku", referencedColumnName = "id_buku", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Buku buku;
    @JoinColumn(name = "id_peminjam", referencedColumnName = "id_peminjam", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Peminjam peminjam;
    @JoinColumn(name = "id_petugas", referencedColumnName = "id_petugas", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Petugas petugas;

    public PeminjamanBuku() {
    }

    public PeminjamanBuku(PeminjamanBukuPK peminjamanBukuPK) {
        this.peminjamanBukuPK = peminjamanBukuPK;
    }

    public PeminjamanBuku(String idPetugas, String idPeminjam, String noPeminjaman, String idBuku) {
        this.peminjamanBukuPK = new PeminjamanBukuPK(idPetugas, idPeminjam, noPeminjaman, idBuku);
    }

    public PeminjamanBukuPK getPeminjamanBukuPK() {
        return peminjamanBukuPK;
    }

    public void setPeminjamanBukuPK(PeminjamanBukuPK peminjamanBukuPK) {
        this.peminjamanBukuPK = peminjamanBukuPK;
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

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peminjamanBukuPK != null ? peminjamanBukuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanBuku)) {
            return false;
        }
        PeminjamanBuku other = (PeminjamanBuku) object;
        if ((this.peminjamanBukuPK == null && other.peminjamanBukuPK != null) || (this.peminjamanBukuPK != null && !this.peminjamanBukuPK.equals(other.peminjamanBukuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Parsistence.PeminjamanBuku[ peminjamanBukuPK=" + peminjamanBukuPK + " ]";
    }
    
}
