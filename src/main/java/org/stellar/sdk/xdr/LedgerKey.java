// Automatically generated by xdrgen 
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;


import java.io.IOException;

// === xdr source ============================================================

//  union LedgerKey switch (LedgerEntryType type)
//  {
//  case ACCOUNT:
//      struct
//      {
//          AccountID accountID;
//      } account;
//  
//  case TRUSTLINE:
//      struct
//      {
//          AccountID accountID;
//          Asset asset;
//      } trustLine;
//  
//  case OFFER:
//      struct
//      {
//          AccountID sellerID;
//          int64 offerID;
//      } offer;
//  
//  case DATA:
//      struct
//      {
//          AccountID accountID;
//          string64 dataName;
//      } data;
//  };

//  ===========================================================================
public class LedgerKey  {
  public LedgerKey () {}
  LedgerEntryType type;
  public LedgerEntryType getDiscriminant() {
    return this.type;
  }
  public void setDiscriminant(LedgerEntryType value) {
    this.type = value;
  }
  private LedgerKeyAccount account;
  public LedgerKeyAccount getAccount() {
    return this.account;
  }
  public void setAccount(LedgerKeyAccount value) {
    this.account = value;
  }
  private LedgerKeyTrustLine trustLine;
  public LedgerKeyTrustLine getTrustLine() {
    return this.trustLine;
  }
  public void setTrustLine(LedgerKeyTrustLine value) {
    this.trustLine = value;
  }
  private LedgerKeyOffer offer;
  public LedgerKeyOffer getOffer() {
    return this.offer;
  }
  public void setOffer(LedgerKeyOffer value) {
    this.offer = value;
  }
  private LedgerKeyData data;
  public LedgerKeyData getData() {
    return this.data;
  }
  public void setData(LedgerKeyData value) {
    this.data = value;
  }
  public static void encode(XdrDataOutputStream stream, LedgerKey encodedLedgerKey) throws IOException {
  //Xdrgen::AST::Identifier
  //LedgerEntryType
  stream.writeInt(encodedLedgerKey.getDiscriminant().getValue());
  switch (encodedLedgerKey.getDiscriminant()) {
  case ACCOUNT:
  LedgerKeyAccount.encode(stream, encodedLedgerKey.account);
  break;
  case TRUSTLINE:
  LedgerKeyTrustLine.encode(stream, encodedLedgerKey.trustLine);
  break;
  case OFFER:
  LedgerKeyOffer.encode(stream, encodedLedgerKey.offer);
  break;
  case DATA:
  LedgerKeyData.encode(stream, encodedLedgerKey.data);
  break;
  }
  }
  public static LedgerKey decode(XdrDataInputStream stream) throws IOException {
  LedgerKey decodedLedgerKey = new LedgerKey();
  LedgerEntryType discriminant = LedgerEntryType.decode(stream);
  decodedLedgerKey.setDiscriminant(discriminant);
  switch (decodedLedgerKey.getDiscriminant()) {
  case ACCOUNT:
  decodedLedgerKey.account = LedgerKeyAccount.decode(stream);
  break;
  case TRUSTLINE:
  decodedLedgerKey.trustLine = LedgerKeyTrustLine.decode(stream);
  break;
  case OFFER:
  decodedLedgerKey.offer = LedgerKeyOffer.decode(stream);
  break;
  case DATA:
  decodedLedgerKey.data = LedgerKeyData.decode(stream);
  break;
  }
    return decodedLedgerKey;
  }

  public static class LedgerKeyAccount {
    public LedgerKeyAccount () {}
    private AccountID accountID;
    public AccountID getAccountID() {
      return this.accountID;
    }
    public void setAccountID(AccountID value) {
      this.accountID = value;
    }
    public static void encode(XdrDataOutputStream stream, LedgerKeyAccount encodedLedgerKeyAccount) throws IOException{
      AccountID.encode(stream, encodedLedgerKeyAccount.accountID);
    }
    public static LedgerKeyAccount decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyAccount decodedLedgerKeyAccount = new LedgerKeyAccount();
      decodedLedgerKeyAccount.accountID = AccountID.decode(stream);
      return decodedLedgerKeyAccount;
    }

  }
  public static class LedgerKeyTrustLine {
    public LedgerKeyTrustLine () {}
    private AccountID accountID;
    public AccountID getAccountID() {
      return this.accountID;
    }
    public void setAccountID(AccountID value) {
      this.accountID = value;
    }
    private Asset asset;
    public Asset getAsset() {
      return this.asset;
    }
    public void setAsset(Asset value) {
      this.asset = value;
    }
    public static void encode(XdrDataOutputStream stream, LedgerKeyTrustLine encodedLedgerKeyTrustLine) throws IOException{
      AccountID.encode(stream, encodedLedgerKeyTrustLine.accountID);
      Asset.encode(stream, encodedLedgerKeyTrustLine.asset);
    }
    public static LedgerKeyTrustLine decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyTrustLine decodedLedgerKeyTrustLine = new LedgerKeyTrustLine();
      decodedLedgerKeyTrustLine.accountID = AccountID.decode(stream);
      decodedLedgerKeyTrustLine.asset = Asset.decode(stream);
      return decodedLedgerKeyTrustLine;
    }

  }
  public static class LedgerKeyOffer {
    public LedgerKeyOffer () {}
    private AccountID sellerID;
    public AccountID getSellerID() {
      return this.sellerID;
    }
    public void setSellerID(AccountID value) {
      this.sellerID = value;
    }
    private Int64 offerID;
    public Int64 getOfferID() {
      return this.offerID;
    }
    public void setOfferID(Int64 value) {
      this.offerID = value;
    }
    public static void encode(XdrDataOutputStream stream, LedgerKeyOffer encodedLedgerKeyOffer) throws IOException{
      AccountID.encode(stream, encodedLedgerKeyOffer.sellerID);
      Int64.encode(stream, encodedLedgerKeyOffer.offerID);
    }
    public static LedgerKeyOffer decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyOffer decodedLedgerKeyOffer = new LedgerKeyOffer();
      decodedLedgerKeyOffer.sellerID = AccountID.decode(stream);
      decodedLedgerKeyOffer.offerID = Int64.decode(stream);
      return decodedLedgerKeyOffer;
    }

  }
  public static class LedgerKeyData {
    public LedgerKeyData () {}
    private AccountID accountID;
    public AccountID getAccountID() {
      return this.accountID;
    }
    public void setAccountID(AccountID value) {
      this.accountID = value;
    }
    private String64 dataName;
    public String64 getDataName() {
      return this.dataName;
    }
    public void setDataName(String64 value) {
      this.dataName = value;
    }
    public static void encode(XdrDataOutputStream stream, LedgerKeyData encodedLedgerKeyData) throws IOException{
      AccountID.encode(stream, encodedLedgerKeyData.accountID);
      String64.encode(stream, encodedLedgerKeyData.dataName);
    }
    public static LedgerKeyData decode(XdrDataInputStream stream) throws IOException {
      LedgerKeyData decodedLedgerKeyData = new LedgerKeyData();
      decodedLedgerKeyData.accountID = AccountID.decode(stream);
      decodedLedgerKeyData.dataName = String64.decode(stream);
      return decodedLedgerKeyData;
    }

  }
}
