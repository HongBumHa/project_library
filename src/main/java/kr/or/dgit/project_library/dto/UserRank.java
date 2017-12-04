package kr.or.dgit.project_library.dto;

public class UserRank {
	private String rankCode;
	private String rankName;
	public String getRankCode() {
		return rankCode;
	}
	public void setRankCode(String rankCode) {
		this.rankCode = rankCode;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	@Override
	public String toString() {
		return "UserRank [rankCode=" + rankCode + ", rankName=" + rankName + "]";
	}
	public UserRank(String rankCode, String rankName) {
		this.rankCode = rankCode;
		this.rankName = rankName;
	}
	
	
}
