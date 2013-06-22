"""
Main build file for LSFN's client program

Whilst you can alter various important things,
such as where the source files live and where the
class files go, it is recommended you don't.
"""

# Program level constants
SOURCE_DIRECTORY = 'src/'
BUILD_DIRECTORY = 'build/'
LIB_DIRECTORY = 'lib/'
# By default, scons' Glob() function returns Scons nodes
# but as we need filenames, have to use this list comprehension.
# Calling str(<scons file node>) gives the filename:
LIB_DIRECTORY_CONTENTS = [str(s) for s in Glob('lib/*')]
OUTPUT_JAR_FILENAME = 'console-pc.jar'

# Scons has a concept of a build 'environment', so this is needed:
# The two parameters tell it to load the default tools, as well as protoc
# protoc.py is located in this directory, so we need to add that to the toolpath
env = Environment()

# task for actually doing the java build:
env.Append(JAVACLASSPATH = LIB_DIRECTORY_CONTENTS) # add lib to the classpath
java_build = env.Java(target = BUILD_DIRECTORY, source = [SOURCE_DIRECTORY])

# task for producing console-pc.jar:
jar_build = env.Jar(target = OUTPUT_JAR_FILENAME, 
					source = [BUILD_DIRECTORY, LIB_DIRECTORY, "Manifest.txt"])

# Tell scons that one must build the java files before JARing them:
env.Depends(jar_build, java_build)

# Tell scons that the default action is to do the jar build:
env.Default(jar_build)
