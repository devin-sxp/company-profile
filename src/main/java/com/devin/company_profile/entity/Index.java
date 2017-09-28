package com.devin.company_profile.entity;
import com.devin.company_profile.entity.base.Base;
public class Index extends Base{
	private String indexTitle;
	private String indexDescription;
	private String indexFile;
	private String aboutDescription;
	private String aboutFile;
	private String expertiseDescription;
	private String expertiseFile;

	public String getIndexTitle() {
		return indexTitle;
	}

	public void setIndexTitle(String indexTitle) {
		this.indexTitle = indexTitle;
	}

	public String getIndexDescription() {
		return indexDescription;
	}

	public void setIndexDescription(String indexDescription) {
		this.indexDescription = indexDescription;
	}

	public String getIndexFile() {
		return indexFile;
	}

	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
	}

	public String getAboutDescription() {
		return aboutDescription;
	}

	public void setAboutDescription(String aboutDescription) {
		this.aboutDescription = aboutDescription;
	}

	public String getAboutFile() {
		return aboutFile;
	}

	public void setAboutFile(String aboutFile) {
		this.aboutFile = aboutFile;
	}

	public String getExpertiseDescription() {
		return expertiseDescription;
	}

	public void setExpertiseDescription(String expertiseDescription) {
		this.expertiseDescription = expertiseDescription;
	}

	public String getExpertiseFile() {
		return expertiseFile;
	}

	public void setExpertiseFile(String expertiseFile) {
		this.expertiseFile = expertiseFile;
	}
}
