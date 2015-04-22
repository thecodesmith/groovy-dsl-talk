#!/usr/bin/env groovy

markdownDir = 'md'
markdownFilter = { dir, file -> file ==~ /.*\.md$/ } as FilenameFilter
markdownFiles = new File(markdownDir).list(markdownFilter).sort()

engine = new groovy.text.SimpleTemplateEngine()
slide = ' ' * 20 + '<section data-markdown="$dir/$file"></section>'

slideTags = []

markdownFiles.each { file ->
    def template = engine.createTemplate(slide).make([dir: markdownDir, file: file])
    slideTags << template.toString()
}

tags = slideTags.join('\n')

templateFile = 'index-template.html'
outputFile = 'index.html'
templateText = new File(templateFile).text

new File(outputFile).withWriter { out ->
    out.write templateText.replace('REPLACE_WITH_SLIDE_TAGS', tags)
}
