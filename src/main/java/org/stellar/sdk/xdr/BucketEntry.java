// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union BucketEntry switch (BucketEntryType type)
//  {
//  case LIVEENTRY:
//  case INITENTRY:
//      LedgerEntry liveEntry;
//  
//  case DEADENTRY:
//      LedgerKey deadEntry;
//  case METAENTRY:
//      BucketMetadata metaEntry;
//  };

//  ===========================================================================
public class BucketEntry  {
  public BucketEntry () {}
  BucketEntryType type;
  public BucketEntryType getDiscriminant() {
    return this.type;
  }
  public void setDiscriminant(BucketEntryType value) {
    this.type = value;
  }
  private LedgerEntry liveEntry;
  public LedgerEntry getLiveEntry() {
    return this.liveEntry;
  }
  public void setLiveEntry(LedgerEntry value) {
    this.liveEntry = value;
  }
  private LedgerKey deadEntry;
  public LedgerKey getDeadEntry() {
    return this.deadEntry;
  }
  public void setDeadEntry(LedgerKey value) {
    this.deadEntry = value;
  }
  private BucketMetadata metaEntry;
  public BucketMetadata getMetaEntry() {
    return this.metaEntry;
  }
  public void setMetaEntry(BucketMetadata value) {
    this.metaEntry = value;
  }
  public static void encode(XdrDataOutputStream stream, BucketEntry encodedBucketEntry) throws IOException {
  //Xdrgen::AST::Identifier
  //BucketEntryType
  stream.writeInt(encodedBucketEntry.getDiscriminant().getValue());
  switch (encodedBucketEntry.getDiscriminant()) {
  case LIVEENTRY:
  case INITENTRY:
  LedgerEntry.encode(stream, encodedBucketEntry.liveEntry);
  break;
  case DEADENTRY:
  LedgerKey.encode(stream, encodedBucketEntry.deadEntry);
  break;
  case METAENTRY:
  BucketMetadata.encode(stream, encodedBucketEntry.metaEntry);
  break;
  }
  }
  public static BucketEntry decode(XdrDataInputStream stream) throws IOException {
  BucketEntry decodedBucketEntry = new BucketEntry();
  BucketEntryType discriminant = BucketEntryType.decode(stream);
  decodedBucketEntry.setDiscriminant(discriminant);
  switch (decodedBucketEntry.getDiscriminant()) {
  case LIVEENTRY:
  case INITENTRY:
  decodedBucketEntry.liveEntry = LedgerEntry.decode(stream);
  break;
  case DEADENTRY:
  decodedBucketEntry.deadEntry = LedgerKey.decode(stream);
  break;
  case METAENTRY:
  decodedBucketEntry.metaEntry = BucketMetadata.decode(stream);
  break;
  }
    return decodedBucketEntry;
  }
}
