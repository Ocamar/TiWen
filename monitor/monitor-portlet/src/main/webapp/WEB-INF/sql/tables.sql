create table M_Bed (
	bedId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	locationId LONG,
	bedNo VARCHAR(75) null,
	alias_ VARCHAR(75) null,
	patientId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table M_Location (
	locationId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	locationNo VARCHAR(75) null,
	locationName VARCHAR(75) null,
	esbEnabled BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null
);

create table M_Node (
	nodeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	nodeNo VARCHAR(75) null,
	locationId LONG,
	nodeType INTEGER,
	ip VARCHAR(75) null,
	lastReceivedTime DATE null,
	lastTransmitTime DATE null,
	status INTEGER,
	createDate DATE null,
	modifiedDate DATE null
);

create table M_Patient (
	patientId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	mrn VARCHAR(75) null,
	name VARCHAR(75) null,
	locationId LONG,
	bedId LONG,
	gender INTEGER,
	birthday DATE null,
	minTemperature DECIMAL(12,2) null,
	maxTemperature DECIMAL(12,2) null,
	tagNo VARCHAR(75) null,
	temperature DECIMAL(12,2) null,
	latestDate DATE null,
	temperatureIn8h DECIMAL(12,2) null,
	highestDate DATE null,
	febrile BOOLEAN,
	alarmLevel DECIMAL(12,2) null,
	discharge BOOLEAN,
	deleted BOOLEAN,
	createDate DATE null,
	modifiedDate DATE null
);

create table M_SystemParameter (
	systemParameterId LONG not null primary key,
	locationId LONG,
	key_ VARCHAR(75) null,
	value VARCHAR(75) null
);

create table M_Tag (
	tagId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	tagNo VARCHAR(75) null,
	type_ INTEGER,
	nodeId LONG,
	locationId LONG,
	status INTEGER,
	patientId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table M_Temperature (
	temperatureId LONG not null primary key,
	patientId LONG,
	temperature DECIMAL(12,2) null,
	createDate DATE null
);

create table M_UserInfo (
	userId LONG not null primary key,
	locationId LONG
);