GoodData CL is written in Java. The source code is [available freely](http://github.com/gooddata/GoodData-CL) from Github under the permissive [BSD license](https://github.com/gooddata/GoodData-CL/blob/master/LICENSE.TXT).

This is GoodData CL source code. Unless you wish to participate in development of the tool, you should choose the easier [binary](http://developer.gooddata.com/gooddata-cl/install.html) install.

# Building from sources

1. [download](http://github.com/gooddata/GoodData-CL/archives/master) the code and unpack *(or git clone this repository)*:

2. make sure you have [Apache Maven](http://maven.apache.org/) installed:

    <div class="platforms">
        <pre class="unix"><code>$ which mvn
    /usr/bin/mvn</code></pre>
        <pre class="win"><code>C:\&gt;mvn --version
    Apache Maven 2.2.1 (r801777; 2009-08-06 21:16:01 +0200)
    [...]</code></pre>
    </div>

3. create the M2_HOME environment variable that points to the Maven root directory

    <div class="platforms">
        <pre class="win"><code>C:\&gt; SET M2_HOME=path-to-your-maven-installation-dir</code></pre>
        <pre class="unix"><code>$ export M2_HOME=path-to-your-maven-installation-dir</code></pre>
    </div>

4. [Make sure](http://confluence.atlassian.com/display/DOC/Setting+the+JAVA_HOME+Variable+in+Windows) that your JAVA_HOME environment variable points to your Java installation directory.  
   *Please note that only the Java versions 1.5 and 1.6 are currently supported.*

5. build the toolkit:

    <div class="platforms">
        <pre class="win"><code>C:\&gt;mvn install</code></pre>
        <pre class="unix"><code>$ mvn install</code></pre>
    </div>

6. build the client distribution

    <div class="platforms">
        <pre class="win"><code>C:\&gt;cd cli-distro
        C:\&gt;mvn assembly:assembly</code></pre>
        <pre class="unix"><code>$ cd cli-distro
        $ mvn assembly:assembly</code></pre>
    </div>

7. unpack one of the distributions that have been built in the cli-distro/target subdirectory:

    - gooddata-cl-1.1.0-SNAPSHOT.tar.gz
    - gooddata-cl-1.1.0-SNAPSHOT.zip

8. run the `gdi` script without arguments to get help from the unpacked distribution:

<div class="platforms">
    <pre class="win"><code>C:&gt; bin\gdi.bat
    usage: GdcDI
     -h,--host &lt;arg&gt;       GoodData host
     -p,--password &lt;arg&gt;   GoodData password
     -u,--username &lt;arg&gt;   GoodData username
    [...]</code></pre>
    <pre class="unix"><code>$ ./bin/gdi.sh
    usage: GdcDI
     -h,--host &lt;arg&gt;       GoodData host
     -p,--password &lt;arg&gt;   GoodData password
     -u,--username &lt;arg&gt;   GoodData username
    [...]</code></pre>
</div>