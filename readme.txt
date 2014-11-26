Diamond是一个持久配置管理中心，核心功能是使应用在运行中感知配置数据的变化。

create database diamond;

grant all on diamond.* to zh@’%’  identified by ‘abc’;

use diamond

create table config_info (

‘id’ bigint(64) unsigned NOT NULL auto_increment,

‘data_id’ varchar(255) NOT NULL default ’ ’,

‘group_id’ varchar(128) NOT NULL default ’ ’,

‘content’ longtext NOT NULL,

‘md5′ varchar(32) NOT NULL default ’ ’,

‘gmt_create’ datetime NOT NULL default ’2010-05-05 00:00:00′,

‘gmt_modified’ datetime NOT NULL default ’2010-05-05 00:00:00′,

PRIMARY KEY  (‘id’),

UNIQUE KEY ‘uk_config_datagroup’ (‘data_id’,'group_id’)

);