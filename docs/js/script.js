$(document).ready(function documentReady() {

    // resizeSidebar();
    // addIdAndClassToH3H4H5();
    addImgFluid();

    const routes = [
        // "ablauf",
        // "fachbegriffe",
        // "mentoren",
        // "links",
    ];

    if (routes.some(route => window.location.href.indexOf(route) > -1)) {
        tocInit();
    } else {
        $("div.container-fluid").removeClass("container-fluid").addClass("container");
        $("#left-sidebar").hide();
    }

    addPaddingBottom();

    $('a[href^="http"]').click(function () {
        $(this).attr('target', '_blank');
    });
});

let currentHash = "#0";
$(document).scroll(function() {
    $('.anchor_tags').each(function() {
        let top = window.pageYOffset;
        let distance = top - $(this).offset().top;
        let hash = $(this).attr('id');
        if (distance < 30 && distance > -30 && currentHash !== hash) {
            window.location.hash = (hash);
            currentHash = hash;
        }
    });
});

$(window).resize(function() {
    resizeSidebar();
});


//functions
const addPaddingBottom = function() {
    let windowHeight = $(window).height();
    $('.js-toc-content').css('padding-bottom', windowHeight * .80);
};

const addIdAndClassToH3H4H5 = function() {
    $("h3, h4, h5").each(function(index) {
        $(this).attr("class", "anchor_tags");
        $(this).attr('id', index);
    });
};

const addImgFluid = function() {
    $("img").each(function() {
        if($(this).id !== "brand-img") {
            $(this).addClass("img-fluid")
        }
    })
};


const resizeSidebar = function() {
    if ($('header').width() >= 768) {
        let windowHeight = $(window).height();
        $('.sidebar').css('height', windowHeight);
    } else {
        $('.sidebar').css('height', "auto");
    }
};

const tocInit = function() {
    tocbot.init({
        // Where to render the table of contents.
        tocSelector: '.js-toc',

        // Where to grab the headings to build the table of contents.
        contentSelector: '.js-toc-content',

        // Which headings to grab inside of the contentSelector element.
        headingSelector: 'h3, h4, h5',

        // Extra classes to add to lists.
        extraListClasses: 'nav flex-column',

        // Class that gets added when a list should be collapsed.
        isCollapsedClass: 'is-collapsed',

        // Class that gets added when a list should be able
        // to be collapsed but isn't necessarily collpased.
        collapsibleClass: 'is-collapsible',

        // How many heading levels should not be collpased.
        // For example, number 6 will show everything since
        // there are only 6 heading levels and number 0 will collpase them all.
        // The sections that are hidden will open
        // and close as you scroll to headings within them.
        collapseDepth: 0,

        // Element to add the positionFixedClass to.
        positionFixedSelector: "#sidebar",

        // Fixed position class to add to make sidebar fixed after scrolling
        // down past the fixedSidebarOffset.
        positionFixedClass: 'is-position-fixed',

        // fixedSidebarOffset can be any number but by default is set
        // to auto which sets the fixedSidebarOffset to the sidebar
        // element's offsetTop from the top of the document on init.
        fixedSidebarOffset: '70',

        // Headings offset between the headings and the top of the document (this is meant for minor adjustments).
        headingsOffset: -70,

    })
};

/*
    // Where to render the table of contents.
    tocSelector: '.js-toc',
    // Where to grab the headings to build the table of contents.
    contentSelector: '.js-toc-content',
    // Which headings to grab inside of the contentSelector element.
    headingSelector: 'h1, h2, h3',
    // Headings that match the ignoreSelector will be skipped.
    ignoreSelector: '.js-toc-ignore',
    // Main class to add to links.
    linkClass: 'toc-link',
    // Extra classes to add to links.
    extraLinkClasses: '',
    // Class to add to active links,
    // the link corresponding to the top most heading on the page.
    activeLinkClass: 'is-active-link',
    // Main class to add to lists.
    listClass: 'toc-list',
    // Extra classes to add to lists.
    extraListClasses: '',
    // Class that gets added when a list should be collapsed.
    isCollapsedClass: 'is-collapsed',
    // Class that gets added when a list should be able
    // to be collapsed but isn't necessarily collpased.
    collapsibleClass: 'is-collapsible',
    // Class to add to list items.
    listItemClass: 'toc-list-item',
    // How many heading levels should not be collpased.
    // For example, number 6 will show everything since
    // there are only 6 heading levels and number 0 will collpase them all.
    // The sections that are hidden will open
    // and close as you scroll to headings within them.
    collapseDepth: 0,
    // Smooth scrolling enabled.
    scrollSmooth: true,
    // Smooth scroll duration.
    scrollSmoothDuration: 420,
    // Callback for scroll end.
    scrollEndCallback: function (e) {},
    // Headings offset between the headings and the top of the document (this is meant for minor adjustments).
    headingsOffset: 1,
    // Timeout between events firing to make sure it's
    // not too rapid (for performance reasons).
    throttleTimeout: 50,
    // Element to add the positionFixedClass to.
    positionFixedSelector: null,
    // Fixed position class to add to make sidebar fixed after scrolling
    // down past the fixedSidebarOffset.
    positionFixedClass: 'is-position-fixed',
    // fixedSidebarOffset can be any number but by default is set
    // to auto which sets the fixedSidebarOffset to the sidebar
    // element's offsetTop from the top of the document on init.
    fixedSidebarOffset: 'auto',
    // includeHtml can be set to true to include the HTML markup from the
    // heading node instead of just including the textContent.
    includeHtml: false,
    // onclick function to apply to all links in toc. will be called with
    // the event as the first parameter, and this can be used to stop,
    // propagation, prevent default or perform action
    onClick: false,
    // orderedList can be set to false to generate unordered lists (ul)
    // instead of ordered lists (ol)
    orderedList: true,
    // If there is a fixed article scroll container, set to calculate titles' offset
    scrollContainer: null
    */
