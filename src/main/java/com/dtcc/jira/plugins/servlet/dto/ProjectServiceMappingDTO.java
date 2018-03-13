package com.dtcc.jira.plugins.servlet.dto;

import com.opencsv.bean.CsvBindByPosition;

public class ProjectServiceMappingDTO {

    private String projectId;

    public String getProjectId() {
	return projectId;
    }

    public void setProjectId(String projectId) {
	this.projectId = projectId;
    }

    public String getProjectName() {
	return projectName;
    }

    public void setProjectName(String projectName) {
	this.projectName = projectName;
    }

    public String getSolutionsArchitect() {
	return solutionsArchitect;
    }

    public void setSolutionsArchitect(String solutionsArchitect) {
	this.solutionsArchitect = solutionsArchitect;
    }

    public String getDevDate() {
	return devDate;
    }

    public void setDevDate(String devDate) {
	this.devDate = devDate;
    }

    public String getQaDate() {
	return qaDate;
    }

    public void setQaDate(String qaDate) {
	this.qaDate = qaDate;
    }

    public String getPseDate() {
	return pseDate;
    }

    public void setPseDate(String pseDate) {
	this.pseDate = pseDate;
    }

    public String getProdDate() {
	return prodDate;
    }

    public void setProdDate(String prodDate) {
	this.prodDate = prodDate;
    }

    public String getCurrenStage() {
	return currenStage;
    }

    public void setCurrenStage(String currenStage) {
	this.currenStage = currenStage;
    }

    public String getExpectedBCMTier() {
	return expectedBCMTier;
    }

    public void setExpectedBCMTier(String expectedBCMTier) {
	this.expectedBCMTier = expectedBCMTier;
    }

    public String getProjectContact() {
	return projectContact;
    }

    public void setProjectContact(String projectContact) {
	this.projectContact = projectContact;
    }

    public String getEstimatedAWSAnnualOPEX() {
	return estimatedAWSAnnualOPEX;
    }

    public void setEstimatedAWSAnnualOPEX(String estimatedAWSAnnualOPEX) {
	this.estimatedAWSAnnualOPEX = estimatedAWSAnnualOPEX;
    }

    public String getCloudProvider() {
	return cloudProvider;
    }

    public void setCloudProvider(String cloudProvider) {
	this.cloudProvider = cloudProvider;
    }

    public String getEc2Consumed() {
	return ec2Consumed;
    }

    public void setEc2Consumed(String ec2Consumed) {
	this.ec2Consumed = ec2Consumed;
    }

    public String getEbsConsumed() {
	return ebsConsumed;
    }

    public void setEbsConsumed(String ebsConsumed) {
	this.ebsConsumed = ebsConsumed;
    }

    public String getEcsConsumed() {
	return ecsConsumed;
    }

    public void setEcsConsumed(String ecsConsumed) {
	this.ecsConsumed = ecsConsumed;
    }

    public String getEcrConsumed() {
	return ecrConsumed;
    }

    public void setEcrConsumed(String ecrConsumed) {
	this.ecrConsumed = ecrConsumed;
    }

    public String getBeanStalkConsumed() {
	return beanStalkConsumed;
    }

    public void setBeanStalkConsumed(String beanStalkConsumed) {
	this.beanStalkConsumed = beanStalkConsumed;
    }

    public String getLambdaConsumed() {
	return lambdaConsumed;
    }

    public void setLambdaConsumed(String lambdaConsumed) {
	this.lambdaConsumed = lambdaConsumed;
    }

    public String getS3Consumed() {
	return s3Consumed;
    }

    public void setS3Consumed(String s3Consumed) {
	this.s3Consumed = s3Consumed;
    }

    public String getGlacierConsumed() {
	return glacierConsumed;
    }

    public void setGlacierConsumed(String glacierConsumed) {
	this.glacierConsumed = glacierConsumed;
    }

    public String getEfsConsumed() {
	return efsConsumed;
    }

    public void setEfsConsumed(String efsConsumed) {
	this.efsConsumed = efsConsumed;
    }

    public String getStorageGatewayConsumed() {
	return storageGatewayConsumed;
    }

    public void setStorageGatewayConsumed(String storageGatewayConsumed) {
	this.storageGatewayConsumed = storageGatewayConsumed;
    }

    public String getRdsmySQLConsumed() {
	return rdsmySQLConsumed;
    }

    public void setRdsmySQLConsumed(String rdsmySQLConsumed) {
	this.rdsmySQLConsumed = rdsmySQLConsumed;
    }

    public String getRdsPostgreSQLConsumed() {
	return rdsPostgreSQLConsumed;
    }

    public void setRdsPostgreSQLConsumed(String rdsPostgreSQLConsumed) {
	this.rdsPostgreSQLConsumed = rdsPostgreSQLConsumed;
    }

    public String getAuroramySQLConsumed() {
	return auroramySQLConsumed;
    }

    public void setAuroramySQLConsumed(String auroramySQLConsumed) {
	this.auroramySQLConsumed = auroramySQLConsumed;
    }

    public String getElasticCacheConsumed() {
	return elasticCacheConsumed;
    }

    public void setElasticCacheConsumed(String elasticCacheConsumed) {
	this.elasticCacheConsumed = elasticCacheConsumed;
    }

    public String getRedShiftConsumed() {
	return redShiftConsumed;
    }

    public void setRedShiftConsumed(String redShiftConsumed) {
	this.redShiftConsumed = redShiftConsumed;
    }

    public String getDynamoDBConsumed() {
	return dynamoDBConsumed;
    }

    public void setDynamoDBConsumed(String dynamoDBConsumed) {
	this.dynamoDBConsumed = dynamoDBConsumed;
    }

    public String getSnowBallConsumed() {
	return snowBallConsumed;
    }

    public void setSnowBallConsumed(String snowBallConsumed) {
	this.snowBallConsumed = snowBallConsumed;
    }

    public String getDmsConsumed() {
	return dmsConsumed;
    }

    public void setDmsConsumed(String dmsConsumed) {
	this.dmsConsumed = dmsConsumed;
    }

    public String getTomcatConsumed() {
	return tomcatConsumed;
    }

    public void setTomcatConsumed(String tomcatConsumed) {
	this.tomcatConsumed = tomcatConsumed;
    }

    public String getElbConsumed() {
	return elbConsumed;
    }

    public void setElbConsumed(String elbConsumed) {
	this.elbConsumed = elbConsumed;
    }

    public String getSnsConsumed() {
	return snsConsumed;
    }

    public void setSnsConsumed(String snsConsumed) {
	this.snsConsumed = snsConsumed;
    }

    public String getSesConsumed() {
	return sesConsumed;
    }

    public void setSesConsumed(String sesConsumed) {
	this.sesConsumed = sesConsumed;
    }

    public String getSqsConsumed() {
	return sqsConsumed;
    }

    public void setSqsConsumed(String sqsConsumed) {
	this.sqsConsumed = sqsConsumed;
    }

    public String getStepFunctionsConsumed() {
	return stepFunctionsConsumed;
    }

    public void setStepFunctionsConsumed(String stepFunctionsConsumed) {
	this.stepFunctionsConsumed = stepFunctionsConsumed;
    }

    public String getCloudFrontConsumed() {
	return cloudFrontConsumed;
    }

    public void setCloudFrontConsumed(String cloudFrontConsumed) {
	this.cloudFrontConsumed = cloudFrontConsumed;
    }

    public String getApiGatewayConsumed() {
	return apiGatewayConsumed;
    }

    public void setApiGatewayConsumed(String apiGatewayConsumed) {
	this.apiGatewayConsumed = apiGatewayConsumed;
    }

    public String getCodeCommitConsumed() {
	return codeCommitConsumed;
    }

    public void setCodeCommitConsumed(String codeCommitConsumed) {
	this.codeCommitConsumed = codeCommitConsumed;
    }

    public String getCloudWatchConsumed() {
	return cloudWatchConsumed;
    }

    public void setCloudWatchConsumed(String cloudWatchConsumed) {
	this.cloudWatchConsumed = cloudWatchConsumed;
    }

    public String getCloudFormationConsumed() {
	return cloudFormationConsumed;
    }

    public void setCloudFormationConsumed(String cloudFormationConsumed) {
	this.cloudFormationConsumed = cloudFormationConsumed;
    }

    public String getCloudTrailConsumed() {
	return cloudTrailConsumed;
    }

    public void setCloudTrailConsumed(String cloudTrailConsumed) {
	this.cloudTrailConsumed = cloudTrailConsumed;
    }

    public String getKinesisConsumed() {
	return kinesisConsumed;
    }

    public void setKinesisConsumed(String kinesisConsumed) {
	this.kinesisConsumed = kinesisConsumed;
    }

    public String getEmrConsumed() {
	return emrConsumed;
    }

    public void setEmrConsumed(String emrConsumed) {
	this.emrConsumed = emrConsumed;
    }

    public String getQuickSightConsumed() {
	return quickSightConsumed;
    }

    public void setQuickSightConsumed(String quickSightConsumed) {
	this.quickSightConsumed = quickSightConsumed;
    }

    public String getVpcConsumed() {
	return vpcConsumed;
    }

    public void setVpcConsumed(String vpcConsumed) {
	this.vpcConsumed = vpcConsumed;
    }

    public String getDirectConnectConsumed() {
	return directConnectConsumed;
    }

    public void setDirectConnectConsumed(String directConnectConsumed) {
	this.directConnectConsumed = directConnectConsumed;
    }

    public String getRoute53Consumed() {
	return route53Consumed;
    }

    public void setRoute53Consumed(String route53Consumed) {
	this.route53Consumed = route53Consumed;
    }

    public String getIamConsumed() {
	return iamConsumed;
    }

    public void setIamConsumed(String iamConsumed) {
	this.iamConsumed = iamConsumed;
    }

    public String getWafConsumed() {
	return wafConsumed;
    }

    public void setWafConsumed(String wafConsumed) {
	this.wafConsumed = wafConsumed;
    }

    public String getCmsConsumed() {
	return cmsConsumed;
    }

    public void setCmsConsumed(String cmsConsumed) {
	this.cmsConsumed = cmsConsumed;
    }

    public String getCognitoConsumed() {
	return cognitoConsumed;
    }

    public void setCognitoConsumed(String cognitoConsumed) {
	this.cognitoConsumed = cognitoConsumed;
    }

    public String getAwsShieldConsumed() {
	return awsShieldConsumed;
    }

    public void setAwsShieldConsumed(String awsShieldConsumed) {
	this.awsShieldConsumed = awsShieldConsumed;
    }

    public String getKmsConsumed() {
	return kmsConsumed;
    }

    public void setKmsConsumed(String kmsConsumed) {
	this.kmsConsumed = kmsConsumed;
    }

    public String getAmazonComplianceConsumed() {
	return amazonComplianceConsumed;
    }

    public void setAmazonComplianceConsumed(String amazonComplianceConsumed) {
	this.amazonComplianceConsumed = amazonComplianceConsumed;
    }

    public String getAwsxrayConsumed() {
	return awsxrayConsumed;
    }

    public void setAwsxrayConsumed(String awsxrayConsumed) {
	this.awsxrayConsumed = awsxrayConsumed;
    }

    public String getSwfConsumed() {
	return swfConsumed;
    }

    public void setSwfConsumed(String swfConsumed) {
	this.swfConsumed = swfConsumed;
    }

    public String getAwsGlueConsumed() {
	return awsGlueConsumed;
    }

    public void setAwsGlueConsumed(String awsGlueConsumed) {
	this.awsGlueConsumed = awsGlueConsumed;
    }

    public String getAthenaConsumed() {
	return athenaConsumed;
    }

    public void setAthenaConsumed(String athenaConsumed) {
	this.athenaConsumed = athenaConsumed;
    }

    public String getAwsBatchConsumed() {
	return awsBatchConsumed;
    }

    public void setAwsBatchConsumed(String awsBatchConsumed) {
	this.awsBatchConsumed = awsBatchConsumed;
    }

    public String getAmazonPayConsumed() {
	return amazonPayConsumed;
    }

    public void setAmazonPayConsumed(String amazonPayConsumed) {
	this.amazonPayConsumed = amazonPayConsumed;
    }

    public String getAppProxyTrustBuilderConsumed() {
	return appProxyTrustBuilderConsumed;
    }

    public void setAppProxyTrustBuilderConsumed(String appProxyTrustBuilderConsumed) {
	this.appProxyTrustBuilderConsumed = appProxyTrustBuilderConsumed;
    }

    public String getAppProxyPingConsumed() {
	return appProxyPingConsumed;
    }

    public void setAppProxyPingConsumed(String appProxyPingConsumed) {
	this.appProxyPingConsumed = appProxyPingConsumed;
    }

    public String getDedicatedBandwidth() {
	return dedicatedBandwidth;
    }

    public void setDedicatedBandwidth(String dedicatedBandwidth) {
	this.dedicatedBandwidth = dedicatedBandwidth;
    }

    public String getInternetBandwidth() {
	return internetBandwidth;
    }

    public void setInternetBandwidth(String internetBandwidth) {
	this.internetBandwidth = internetBandwidth;
    }

    public String getSpecialCircumstances() {
	return specialCircumstances;
    }

    public void setSpecialCircumstances(String specialCircumstances) {
	this.specialCircumstances = specialCircumstances;
    }

    public String getPatternUsage() {
	return patternUsage;
    }

    public void setPatternUsage(String patternUsage) {
	this.patternUsage = patternUsage;
    }

    @CsvBindByPosition(position = 0)
    private String projectName;
    @CsvBindByPosition(position = 1)
    private String solutionsArchitect;
    @CsvBindByPosition(position = 2)
    private String devDate;
    @CsvBindByPosition(position = 3)
    private String qaDate;
    @CsvBindByPosition(position = 4)
    private String pseDate;
    @CsvBindByPosition(position = 5)
    private String prodDate;
    @CsvBindByPosition(position = 6)
    private String currenStage;
    @CsvBindByPosition(position = 7)
    private String expectedBCMTier;
    @CsvBindByPosition(position = 8)
    private String projectContact;
    @CsvBindByPosition(position = 9)
    private String estimatedAWSAnnualOPEX;
    @CsvBindByPosition(position = 10)
    private String cloudProvider;
    @CsvBindByPosition(position = 11)
    private String ec2Consumed;
    @CsvBindByPosition(position = 12)
    private String ebsConsumed;
    @CsvBindByPosition(position = 13)
    private String ecsConsumed;
    @CsvBindByPosition(position = 14)
    private String ecrConsumed;
    @CsvBindByPosition(position = 15)
    private String beanStalkConsumed;
    @CsvBindByPosition(position = 16)
    private String lambdaConsumed;
    @CsvBindByPosition(position = 17)
    private String s3Consumed;
    @CsvBindByPosition(position = 18)
    private String glacierConsumed;
    @CsvBindByPosition(position = 19)
    private String efsConsumed;
    @CsvBindByPosition(position = 20)
    private String storageGatewayConsumed;
    @CsvBindByPosition(position = 21)
    private String rdsmySQLConsumed;
    @CsvBindByPosition(position = 22)
    private String rdsPostgreSQLConsumed;
    @CsvBindByPosition(position = 23)
    private String auroramySQLConsumed;
    @CsvBindByPosition(position = 24)
    private String elasticCacheConsumed;
    @CsvBindByPosition(position = 25)
    private String redShiftConsumed;
    @CsvBindByPosition(position = 26)
    private String dynamoDBConsumed;
    @CsvBindByPosition(position = 27)
    private String snowBallConsumed;
    @CsvBindByPosition(position = 28)
    private String dmsConsumed;
    @CsvBindByPosition(position = 29)
    private String tomcatConsumed;
    @CsvBindByPosition(position = 30)
    private String elbConsumed;
    @CsvBindByPosition(position = 31)
    private String snsConsumed;
    @CsvBindByPosition(position = 32)
    private String sesConsumed;
    @CsvBindByPosition(position = 33)
    private String sqsConsumed;
    @CsvBindByPosition(position = 34)
    private String stepFunctionsConsumed;
    @CsvBindByPosition(position = 35)
    private String cloudFrontConsumed;
    @CsvBindByPosition(position = 36)
    private String apiGatewayConsumed;
    @CsvBindByPosition(position = 37)
    private String codeCommitConsumed;
    @CsvBindByPosition(position = 38)
    private String cloudWatchConsumed;
    @CsvBindByPosition(position = 39)
    private String cloudFormationConsumed;
    @CsvBindByPosition(position = 40)
    private String cloudTrailConsumed;
    @CsvBindByPosition(position = 41)
    private String kinesisConsumed;
    @CsvBindByPosition(position = 42)
    private String emrConsumed;
    @CsvBindByPosition(position = 43)
    private String quickSightConsumed;
    @CsvBindByPosition(position = 44)
    private String vpcConsumed;
    @CsvBindByPosition(position = 45)
    private String directConnectConsumed;
    @CsvBindByPosition(position = 46)
    private String route53Consumed;
    @CsvBindByPosition(position = 47)
    private String iamConsumed;
    @CsvBindByPosition(position = 48)
    private String wafConsumed;
    @CsvBindByPosition(position = 49)
    private String cmsConsumed;
    @CsvBindByPosition(position = 50)
    private String cognitoConsumed;
    @CsvBindByPosition(position = 51)
    private String awsShieldConsumed;
    @CsvBindByPosition(position = 52)
    private String kmsConsumed;
    @CsvBindByPosition(position = 53)
    private String amazonComplianceConsumed;
    @CsvBindByPosition(position = 54)
    private String awsxrayConsumed;
    @CsvBindByPosition(position = 55)
    private String swfConsumed;
    @CsvBindByPosition(position = 56)
    private String awsGlueConsumed;
    @CsvBindByPosition(position = 57)
    private String athenaConsumed;
    @CsvBindByPosition(position = 58)
    private String awsBatchConsumed;
    @CsvBindByPosition(position = 59)
    private String amazonPayConsumed;
    @CsvBindByPosition(position = 60)
    private String appProxyTrustBuilderConsumed;
    @CsvBindByPosition(position = 61)
    private String appProxyPingConsumed;
    @CsvBindByPosition(position = 62)
    private String dedicatedBandwidth;
    @CsvBindByPosition(position = 63)
    private String internetBandwidth;
    @CsvBindByPosition(position = 64)
    private String specialCircumstances;
    @CsvBindByPosition(position = 65)
    private String patternUsage;

    @Override
    public String toString() {
	return "ProjectServiceMappingDTO [projectId=" + projectId + ", projectName=" + projectName
		+ ", solutionsArchitect=" + solutionsArchitect + ", devDate=" + devDate + ", qaDate=" + qaDate
		+ ", pseDate=" + pseDate + ", prodDate=" + prodDate + ", currenStage=" + currenStage
		+ ", expectedBCMTier=" + expectedBCMTier + ", projectContact=" + projectContact
		+ ", estimatedAWSAnnualOPEX=" + estimatedAWSAnnualOPEX + ", cloudProvider=" + cloudProvider
		+ ", ec2Consumed=" + ec2Consumed + ", ebsConsumed=" + ebsConsumed + ", ecsConsumed=" + ecsConsumed
		+ ", ecrConsumed=" + ecrConsumed + ", beanStalkConsumed=" + beanStalkConsumed + ", lambdaConsumed="
		+ lambdaConsumed + ", s3Consumed=" + s3Consumed + ", glacierConsumed=" + glacierConsumed
		+ ", efsConsumed=" + efsConsumed + ", storageGatewayConsumed=" + storageGatewayConsumed
		+ ", rdsmySQLConsumed=" + rdsmySQLConsumed + ", rdsPostgreSQLConsumed=" + rdsPostgreSQLConsumed
		+ ", auroramySQLConsumed=" + auroramySQLConsumed + ", elasticCacheConsumed=" + elasticCacheConsumed
		+ ", redShiftConsumed=" + redShiftConsumed + ", dynamoDBConsumed=" + dynamoDBConsumed
		+ ", snowBallConsumed=" + snowBallConsumed + ", dmsConsumed=" + dmsConsumed + ", tomcatConsumed="
		+ tomcatConsumed + ", elbConsumed=" + elbConsumed + ", snsConsumed=" + snsConsumed + ", sesConsumed="
		+ sesConsumed + ", sqsConsumed=" + sqsConsumed + ", stepFunctionsConsumed=" + stepFunctionsConsumed
		+ ", cloudFrontConsumed=" + cloudFrontConsumed + ", apiGatewayConsumed=" + apiGatewayConsumed
		+ ", codeCommitConsumed=" + codeCommitConsumed + ", cloudWatchConsumed=" + cloudWatchConsumed
		+ ", cloudFormationConsumed=" + cloudFormationConsumed + ", cloudTrailConsumed=" + cloudTrailConsumed
		+ ", kinesisConsumed=" + kinesisConsumed + ", emrConsumed=" + emrConsumed + ", quickSightConsumed="
		+ quickSightConsumed + ", vpcConsumed=" + vpcConsumed + ", directConnectConsumed="
		+ directConnectConsumed + ", route53Consumed=" + route53Consumed + ", iamConsumed=" + iamConsumed
		+ ", wafConsumed=" + wafConsumed + ", cmsConsumed=" + cmsConsumed + ", cognitoConsumed="
		+ cognitoConsumed + ", awsShieldConsumed=" + awsShieldConsumed + ", kmsConsumed=" + kmsConsumed
		+ ", amazonComplianceConsumed=" + amazonComplianceConsumed + ", awsxrayConsumed=" + awsxrayConsumed
		+ ", swfConsumed=" + swfConsumed + ", awsGlueConsumed=" + awsGlueConsumed + ", athenaConsumed="
		+ athenaConsumed + ", awsBatchConsumed=" + awsBatchConsumed + ", amazonPayConsumed=" + amazonPayConsumed
		+ ", appProxyTrustBuilderConsumed=" + appProxyTrustBuilderConsumed + ", appProxyPingConsumed="
		+ appProxyPingConsumed + ", dedicatedBandwidth=" + dedicatedBandwidth + ", internetBandwidth="
		+ internetBandwidth + ", specialCircumstances=" + specialCircumstances + ", patternUsage="
		+ patternUsage + "]";
    }

}
