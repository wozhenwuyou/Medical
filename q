[33mcommit 06ed4e54d4cd505141bcaf666c3cd3ca68dee800[m
Author: hefuqiang <hefuqiang@wonature.com>
Date:   Mon Aug 14 13:57:46 2017 +0800

    健康档案8.11版

[1mdiff --git a/.classpath b/.classpath[m
[1mnew file mode 100644[m
[1mindex 0000000..c0f4868[m
[1m--- /dev/null[m
[1m+++ b/.classpath[m
[36m@@ -0,0 +1,32 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<classpath>[m
[32m+[m	[32m<classpathentry kind="src" output="target/classes" path="src/main/java">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="optional" value="true"/>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="src" output="target/test-classes" path="src/test/java">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="optional" value="true"/>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.7">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m			[32m<attribute name="org.eclipse.jst.component.dependency" value="/WEB-INF/lib"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="output" path="target/classes"/>[m
[32m+[m[32m</classpath>[m
[1mdiff --git a/.externalToolBuilders/org.eclipse.wst.validation.validationbuilder.launch b/.externalToolBuilders/org.eclipse.wst.validation.validationbuilder.launch[m
[1mnew file mode 100644[m
[1mindex 0000000..6ef634c[m
[1m--- /dev/null[m
[1m+++ b/.externalToolBuilders/org.eclipse.wst.validation.validationbuilder.launch[m
[36m@@ -0,0 +1,7 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8" standalone="no"?>[m
[32m+[m[32m<launchConfiguration type="org.eclipse.ant.AntBuilderLaunchConfigurationType">[m
[32m+[m[32m<booleanAttribute key="org.eclipse.ui.externaltools.ATTR_BUILDER_ENABLED" value="false"/>[m
[32m+[m[32m<stringAttribute key="org.eclipse.ui.externaltools.ATTR_DISABLED_BUILDER" value="org.eclipse.wst.validation.validationbuilder"/>[m
[32m+[m[32m<mapAttribute key="org.eclipse.ui.externaltools.ATTR_TOOL_ARGUMENTS"/>[m
[32m+[m[32m<booleanAttribute key="org.eclipse.ui.externaltools.ATTR_TRIGGERS_CONFIGURED" value="true"/>[m
[32m+[m[32m</launchConfiguration>[m
[1mdiff --git a/.gitignore b/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..64effc5[m
[1m--- /dev/null[m
[1m+++ b/.gitignore[m
[36m@@ -0,0 +1,8 @@[m
[32m+[m[32m＃ Target file[m
[32m+[m[32m/target/*[m
[32m+[m
[32m+[m[32m# Compiled class file[m
[32m+[m[32m*.class[m
[32m+[m
[32m+[m[32m# Log file[m
[32m+[m[32m*.log[m
[1mdiff --git a/.project b/.project[m
[1mnew file mode 100644[m
[1mindex 0000000..6ddb43f[m
[1m--- /dev/null[m
[1m+++ b/.project[m
[36m@@ -0,0 +1,48 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<projectDescription>[m
[32m+[m	[32m<name>Medical</name>[m
[32m+[m	[32m<comment></comment>[m
[32m+[m	[32m<projects>[m
[32m+[m	[32m</projects>[m
[32m+[m	[32m<buildSpec>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.jdt.core.javabuilder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.wst.common.project.facet.core.builder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.m2e.core.maven2Builder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.ui.externaltools.ExternalToolBuilder</name>[m
[32m+[m			[32m<triggers>full,incremental,</triggers>[m
[32m+[m			[32m<arguments>[m
[32m+[m				[32m<dictionary>[m
[32m+[m					[32m<key>LaunchConfigHandle</key>[m
[32m+[m					[32m<value>&lt;project&gt;/.externalToolBuilders/org.eclipse.wst.validation.validationbuilder.launch</value>[m
[32m+[m				[32m</dictionary>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.springframework.ide.eclipse.core.springbuilder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m	[32m</buildSpec>[m
[32m+[m	[32m<natures>[m
[32m+[m		[32m<nature>org.springframework.ide.eclipse.core.springnature</nature>[m
[32m+[m		[32m<nature>org.eclipse.jem.workbench.JavaEMFNature</nature>[m
[32m+[m		[32m<nature>org.eclipse.wst.common.modulecore.ModuleCoreNature</nature>[m
[32m+[m		[32m<nature>org.eclipse.jdt.core.javanature</nature>[m
[32m+[m		[32m<nature>org.eclipse.m2e.core.maven2Nature</nature>[m
[32m+[m		[32m<nature>org.eclipse.wst.common.project.facet.core.nature</nature>[m
[32m+[m		[32m<nature>org.eclipse.wst.jsdt.core.jsNature</nature>[m
[32m+[m	[32m</natures>[m
[32m+[m[32m</projectDescription>[m
[1mdiff --git a/.settings/.jsdtscope b/.settings/.jsdtscope[m
[1mnew file mode 100644[m
[1mindex 0000000..2418123[m
[1m--- /dev/null[m
[1m+++ b/.settings/.jsdtscope[m
[36m@@ -0,0 +1,13 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<classpath>[m
[32m+[m	[32m<classpathentry excluding="**/bower_components/*|**/node_modules/*|**/*.min.js" kind="src" path="src/main/webapp"/>[m
[32m+[m	[32m<classpathentry kind="src" path="target/m2e-wtp/web-resources"/>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.wst.jsdt.launching.JRE_CONTAINER"/>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.wst.jsdt.launching.WebProject">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="hide" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.wst.jsdt.launching.baseBrowserLibrary"/>[m
[32m+[m	[32m<classpathentry kind="output" path=""/>[m
[32m+[m[32m</classpath>[m
[1mdiff --git a/.settings/org.eclipse.core.resources.prefs b/.settings/org.eclipse.core.resources.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..0fc6f7a[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.core.resources.prefs[m
[36m@@ -0,0 +1,14 @@[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32mencoding//src/main/java=UTF-8[m
[32m+[m[32mencoding//src/main/resources=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/doc/\u6570\u636E\u5E93\u811A\u672C_6.27.txt=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/doc/\u6570\u636E\u5E93\u811A\u672C_6.29.txt=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/doc/\u6570\u636E\u5E93\u8BF4\u660E7.23.txt=GBK[m
[32m+[m[32mencoding//src/main/webapp/third-party/ueditor/jsp/config.json=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/views/front/common/doctor/doctorLeft.htm=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/views/front/common/hospital/hospitalLeft.htm=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/views/front/common/menuTop.htm=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/views/front/common/top.htm=UTF-8[m
[32m+[m[32mencoding//src/main/webapp/views/front/common/user/userLeft.htm=UTF-8[m
[32m+[m[32mencoding//src/test/java=UTF-8[m
[32m+[m[32mencoding/<project>=UTF-8[m
[1mdiff --git a/.settings/org.eclipse.jdt.core.prefs b/.settings/org.eclipse.jdt.core.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..443e085[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.jdt.core.prefs[m
[36m@@ -0,0 +1,8 @@[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32morg.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled[m
[32m+[m[32morg.eclipse.jdt.core.compiler.codegen.targetPlatform=1.7[m
[32m+[m[32morg.eclipse.jdt.core.compiler.compliance=1.7[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.assertIdentifier=error[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.enumIdentifier=error[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.forbiddenReference=warning[m
[32m+[m[32morg.eclipse.jdt.core.compiler.source=1.7[m
[1mdiff --git a/.settings/org.eclipse.m2e.core.prefs b/.settings/org.eclipse.m2e.core.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..f897a7f[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.m2e.core.prefs[m
[36m@@ -0,0 +1,4 @@[m
[32m+[m[32mactiveProfiles=[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32mresolveWorkspaceProjects=true[m
[32m+[m[32mversion=1[m
[1mdiff --git a/.settings/org.eclipse.wst.common.component b/.settings/org.eclipse.wst.common.component[m
[1mnew file mode 100644[m
[1mindex 0000000..6c46f8f[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.wst.common.component[m
[36m@@ -0,0 +1,11 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?><project-modules id="moduleCoreId" project-version="1.5.0">[m
[32m+[m[32m    <wb-module deploy-name="Medical">[m
[32m+[m[32m        <wb-resource deploy-path="/" source-path="/target/m2e-wtp/web-resources"/>[m
[32m+[m[32m        <wb-resource deploy-path="/" source-path="/src/main/webapp" tag="defaultRootSource"/>[m
[32m+[m[32m        <wb-resource deploy-path="/WEB-INF/classes" source-path="/src/main/java"/>[m
[32m+[m[32m        <wb-resource deploy-path="/WEB-INF/classes" source-path="/src/main/resources"/>[m
[32m+[m[32m        <property name="context-root" value="Medical"/>[m
[32m+[m[32m        <property name="java-output-path" value="/Medical/target/classes"/>[m
[32m+[m[32m        <property name="component.exclusion.patterns" value="WEB-INF/web.xml"/>[m
[32m+[m[32m    </wb-module>[m
[32m+[m[32m</project-modules>[m
[1mdiff --git a/.settings/org.eclipse.wst.common.project.facet.core.prefs.xml b/.settings/org.eclipse.wst.common.project.facet.core.prefs.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..cc81385[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.wst.common.project.facet.core.prefs.xml[m
[36m@@ -0,0 +1,7 @@[m
[32m+[m[32m<root>[m
[32m+[m[32m  <facet id="jst.jaxrs">[m
[32m+[m[32m    <node name="libprov">[m
[32m+[m[32m      <attribute name="provider-id" value="jaxrs-no-op-library-provider"/>[m
[32m+[m[32m    </node>[m
[32m+[m[32m  </facet>[m
[32m+[m[32m</root>[m
[1mdiff --git a/.settings/org.eclipse.wst.common.project.facet.core.xml b/.settings/org.eclipse.wst.common.project.facet.core.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..25d173a[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.wst.common.project.facet.core.xml[m
[36m@@ -0,0 +1,8 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<faceted-project>[m
[32m+[m[32m  <fixed facet="wst.jsdt.web"/>[m
[32m+[m[32m  <installed facet="java" version="1.7"/>[m
[32m+[m[32m  <installed facet="jst.web" version="3.0"/>[m
[32m+[m[32m  <installed facet="jst.jaxrs" version="2.0"/>[m
[32m+[m[32m  <installed facet="wst.jsdt.web" version="1.0"/>[m
[32m+[m[32m</faceted-project>[m
[1mdiff --git a/.settings/org.eclipse.wst.jsdt.ui.superType.container b/.settings/org.eclipse.wst.jsdt.ui.superType.container[m
[1mnew file mode 100644[m
[1mindex 0000000..3bd5d0a[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.wst.jsdt.ui.superType.container[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32morg.eclipse.wst.jsdt.launching.baseBrowserLibrary[m
\ No newline at end of file[m
[1mdiff --git a/.settings/org.eclipse.wst.jsdt.ui.superType.name b/.settings/org.eclipse.wst.jsdt.ui.superType.name[m
[1mnew file mode 100644[m
[1mindex 0000000..05bd71b[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.wst.jsdt.ui.superType.name[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32mWindow[m
\ No newline at end of file[m
[1mdiff --git a/.settings/org.eclipse.wst.validation.prefs b/.settings/org.eclipse.wst.validation.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..04cad8c[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.wst.validation.prefs[m
[36m@@ -0,0 +1,2 @@[m
[32m+[m[32mdisabled=06target[m
[32m+[m[32meclipse.preferences.version=1[m
[1mdiff --git a/Gruntfile.js b/Gruntfile.js[m
[1mnew file mode 100644[m
[1mindex 0000000..2d240ee[m
[1m--- /dev/null[m
[1m+++ b/Gruntfile.js[m
[36m@@ -0,0 +1,69 @@[m
[32m+[m[32mmodule.exports = function(grunt) {[m
[32m+[m
[32m+[m[32m  // Project configuration.[m
[32m+[m[32m  grunt.initConfig({[m
[32m+[m[32m    pkg: grunt.file.readJSON('package.json'),[m
[32m+[m[32m    clean: ["src/main/webapp/build/js","src/main/webapp/build/css","src/main/webapp/build/views"],[m
[32m+[m[32m    uglify: {[m
[32m+[m[32m      options: {[m
[32m+[m[32m        banner: '/*! <%= pkg.name %>-<%= pkg.version %> - <%= grunt.template.today("yyyy-mm-dd") %> */\n'[m
[32m+[m[32m      },[m
[32m+[m[32m      build: {[m
[32m+[m[32m        files: [{[m
[32m+[m[32m                    expand:true,[m
[32m+[m[32m                    cwd:'src/main/webapp/js',//js目录下[m
[32m+[m[32m                    src:'**/*.js',//所有js文件[m
[32m+[m[32m                    dest: 'src/main/webapp/build/js',//输出到此目录下[m
[32m+[m[32m                    ext: '-<%= pkg.version %>.min.js'[m
[32m+[m[32m                }][m
[32m+[m[32m      }[m
[32m+[m[32m    },[m
[32m+[m[32m    cssmin: {[m
[32m+[m	[32m  options: {                                 // Target options[m[41m [m
[32m+[m	[32m      advanced :false[m
[32m+[m	[32m  },[m
[32m+[m[32m      target: {[m
[32m+[m[32m        files: [{[m
[32m+[m[32m          expand: true,[m
[32m+[m[32m          cwd: 'src/main/webapp/css',[m
[32m+[m[32m          src: '**/*.css',[m
[32m+[m[32m          dest: 'src/main/webapp/build/css',[m
[32m+[m[32m          ext: '-<%= pkg.version %>.min.css'[m
[32m+[m[32m        }][m
[32m+[m[32m      }[m
[32m+[m[32m    },[m
[32m+[m[32m    htmlmin: {                                     // Task[m[41m [m
[32m+[m[32m      build: {                                      // Target[m[41m [m
[32m+[m[32m        options: {                                 // Target options[m[41m [m
[32m+[m[32m          removeComments: true,[m
[32m+[m[32m          collapseWhitespace: true,[m
[32m+[m[32m          keepClosingSlash:true,[m
[32m+[m[32m          caseSensitive:true,[m
[32m+[m[32m          preventAttributesEscaping:true[m
[32m+[m[32m        },[m
[32m+[m[32m        files: [{[m
[32m+[m[32m          expand: true,[m
[32m+[m[32m          cwd: 'src/main/webapp/views',[m
[32m+[m[32m          src: ['**/*.{jsp,htm,html}'],[m
[32m+[m[32m          dest: 'src/main/webapp/build/views'[m
[32m+[m[32m        }][m
[32m+[m[32m      }[m
[32m+[m[32m    },[m
[32m+[m[32m    usemin: {[m
[32m+[m[32m      html: ['src/main/webapp/build/views/*.{jsp.htm,html}'][m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m  });[m
[32m+[m
[32m+[m[32m  grunt.loadNpmTasks('grunt-contrib-clean');[m
[32m+[m[32m  // 加载包含 "uglify" 任务的插件。[m
[32m+[m[32m  grunt.loadNpmTasks('grunt-contrib-uglify');[m
[32m+[m[32m  grunt.loadNpmTasks('grunt-contrib-cssmin');[m
[32m+[m[32m  grunt.loadNpmTasks('grunt-contrib-htmlmin');[m
[32m+[m[32m  grunt.loadNpmTasks