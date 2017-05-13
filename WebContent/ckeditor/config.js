/**
 * @license Copyright (c) 2003-2017, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	// Define changes to default configuration here.
	// For complete reference see:
	// http://docs.ckeditor.com/#!/api/CKEDITOR.config

	// The toolbar groups arrangement, optimized for two toolbar rows.
	config.toolbarGroups = [
		{ name: 'clipboard',   groups: [ 'clipboard', 'undo' ] },
		{ name: 'editing',     groups: [ 'find', 'selection', 'spellchecker' ] },
		{ name: 'links' },
		{ name: 'insert' },
		{ name: 'forms' },
		{ name: 'tools' },
		{ name: 'document',	   groups: [ 'mode', 'document', 'doctools' ] },
		{ name: 'others' },
		'/',
		{ name: 'basicstyles', groups: [ 'basicstyles', 'cleanup' ] },
		{ name: 'paragraph',   groups: [ 'list', 'indent', 'blocks', 'align', 'bidi' ] },
		{ name: 'styles' },
		{ name: 'colors' },
		{ name: 'about' }
	];

	// Remove some buttons provided by the standard plugins, which are
	// not needed in the Standard(s) toolbar.
	config.removeButtons = 'Underline,Subscript,Superscript';

	// Set the most common block elements.
	config.format_tags = 'p;h1;h2;h3;pre';

	// Simplify the dialog windows.
	config.removeDialogTabs = 'image:advanced;link:advanced';
	config.language = 'zh-cn'; // 配置语言    
    config.uiColor = '#FFF'; // 背景颜色    
    config.width = 'auto'; // 宽度    
    config.height = '200px'; // 高度    
    config.skin = 'office2003';//界面v2,kama,office2003  
    config.toolbar = [ ['Bold', 'Italic', 'Underline', '-','Link', 'Unlink', '-', 'Format','Font','FontSize' ] ];//用户自定义的编辑框，可以根据自己的需要任意加入或者去掉元素，这样可以保持编辑框简单明了.  
    config.toolbarCanCollapse = false;  
    config.resize_enabled = false;  
    config.enterMode = CKEDITOR.ENTER_BR;  
    config.shiftEnterMode = CKEDITOR.ENTER_P; 
};
